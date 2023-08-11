package com.amdocs.product.catalog.controller;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.product.catalog.model.Product;
import com.amdocs.product.catalog.service.CatalogService;

@RestController
@CrossOrigin(origins="http://localhost:7090")
@RequestMapping("/catalog")
public class ProductController {
	@Autowired
	CatalogService proService;
	@GetMapping("/product")
	private List<Product> getAllProduct() {  
		return proService.getAllProduct();  
	}  
	@GetMapping("/product/{id}")  
	private Product getProduct(@PathVariable("id") int id) {  
		return proService.getProductById(id);  
	}  
	@DeleteMapping("/product/{id}")  
	private void deleteProduct(@PathVariable("id") int id){  
		proService.delete(id);  
	}
	@PostMapping("/product")  
	private int saveProduct(@RequestBody Product product)   
	{  
		proService.saveOrUpdate(product);  
		return product.getId();  
	}  

}
//Add a new ProductController Class to expose below APIs in the form of REST.

