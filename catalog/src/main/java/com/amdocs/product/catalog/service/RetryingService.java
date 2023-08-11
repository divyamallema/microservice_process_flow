package com.amdocs.product.catalog.service;

import io.github.resilience4j.retry.RetryRegistry;
import io.github.resilience4j.retry.annotation.Retry;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.product.catalog.service;
import com.amdocs.product.catalog.model.Product;
import com.amdocs.product.catalog.model.ProductResponse;
import com.amdocs.product.catalog.model;
import com.amdocs.product.catalog.controller;
import com.amdocs.product.catalog;

@Service
public class RetryingService {
	@Autowired
	private CatalogService catalogService;

	@Autowired
	private RetryRegistry registry;

	@Retry(name = "basic")
	public Product basicExample(ProductResponse response) {
		return catalogService.getProductById(response.getId());
	}
}
