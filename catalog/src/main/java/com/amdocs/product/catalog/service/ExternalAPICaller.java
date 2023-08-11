/*package com.amdocs.product.catalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Component
public class ExternalAPICaller {
	private final RestTemplate restTemplate;
	
	@RestController
	@RequestMapping("/api/")
	private final 
	
	@Autowired 
	public ExternalAPICaller(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@GetMapping("/circuit-breaker")
	@CircuitBreaker(name = "CircuitBreakerService")
	public String circuitBreakerApi() {
		return externalAPICaller.callApi();
	}
	
	public String callApi() {
	    return restTemplate.getForObject("/api/external", String.class);
	}
}
*/