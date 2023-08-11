package com.amdocs.product.catalog.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.amdocs.product.catalog.model.Product;
import com.amdocs.product.catalog.model.TaxResponse;
import com.amdocs.product.catalog.repository.ProductRepository;
import com.amdocs.product.catalog.service.ExternalAPICaller;

@Service
public class CatalogService {
	@Autowired
	ProductRepository proRepo;
	@Autowired
	RestTemplate restTemplate;

//	@Bean
//	public RestTemplate restTemplate() {
//	    return new RestTemplateBuilder().rootUri("http://localhost:8097")
//	      .build();
//	}
	
	
	// getting all student records
	public List<Product> getAllProduct() {
		List<Product> products = new ArrayList<Product>();
		proRepo.findAll().forEach(product -> products.add(product));
		return products;
	}

	// getting a specific record
	public Product getProductById(int id) {
		return proRepo.findById(id).get();
	}

	public void saveOrUpdate(Product product) {
		URI targetUrl = UriComponentsBuilder.fromUriString("http://localhost:8096") // Build the base link
				.path("/tax") // Add path
				.queryParam("amount", product.getPrice()) // Add one or more query params
				.build() // Build the URL
				.encode() // Encode any URI items that need to be encoded
				.toUri(); // Convert to URI
		TaxResponse tax = restTemplate.getForObject(targetUrl, TaxResponse.class);
		product.setTaxAmount(tax.getTaxAmount());
		product.setTaxType(tax.getTaxType());
		proRepo.save(product);
	}

	// deleting a specific record
	public void delete(int id) {
		proRepo.deleteById(id);
	}

}
