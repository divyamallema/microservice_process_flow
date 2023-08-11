package com.amdocs.product.tax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.product.tax.model.Tax;
import com.amdocs.product.tax.model.TaxResponse;
import com.amdocs.tax.service.TaxService;

@RestController
public class TaxController {
	@Autowired  
	TaxService taxService;  
	/*
	 * // //// public ResponseEntity<Object> returnTaxDetails(@RequestBody Tax tax)
	 * { //// TaxResponse taxResponse = null; //// if(tax.getType().equals("SALES")
	 * && tax.getAmount() == 10.0) { //// taxResponse = new TaxResponse(); ////
	 * taxResponse.setProductAmount(tax.getAmount()); ////
	 * taxResponse.setTaxAmount(2.0); //// } //// return new
	 * ResponseEntity<Object>(taxResponse, HttpStatus.OK); //// } //
	 */
	
	@GetMapping("/tax")  
	private ResponseEntity getTax(@RequestParam(required = true) Double amount)   
	{  
		
		return new ResponseEntity<Object>(taxService.getTaxById(amount), HttpStatus.OK);
		
	}  
	
	@PostMapping({"/tax"})
	private ResponseEntity<Object> saveTax(@RequestBody Tax tax)   
	{  
	taxService.saveOrUpdate(tax);  
	return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
}
