package com.amdocs.tax.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.product.tax.model.Tax;
import com.amdocs.product.tax.model.TaxResponse;
import com.amdocs.product.tax.repository.TaxRepository;

@Service
public class TaxService {
	
	@Autowired
	TaxRepository taxRepository;  
	
	
	public TaxResponse getTaxById(double amount)   
	{  
		
		TaxResponse taxResponse = new TaxResponse();
		Tax tax = taxRepository.findById(amount).get();  
		taxResponse.setTaxAmount(tax.getTaxAmount());
		taxResponse.setTaxType(tax.getType());
		return taxResponse;
	}  
		
	public void saveOrUpdate(Tax tax)   
	{  
		int percentage = 10;
		double taxAmount = 0.0;
		if (tax.getPercentage() > 0) {
			taxAmount = (tax.getPercentage() * tax.getAmount())/100;
			tax.setPercentage(tax.getPercentage());
		}
		else {
			taxAmount = (percentage * tax.getAmount())/100;
			tax.setPercentage(percentage);
		}
		tax.setTaxAmount(taxAmount);
		taxRepository.save(tax);  
	}  
}
