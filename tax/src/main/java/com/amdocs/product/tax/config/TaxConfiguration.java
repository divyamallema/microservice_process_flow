package com.amdocs.product.tax.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amdocs.tax.service.TaxService;

@Configuration
public class TaxConfiguration {
	
	@Bean
	public TaxService taxService() {
		return new TaxService();
	}

}
