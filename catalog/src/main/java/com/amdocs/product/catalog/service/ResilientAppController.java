package com.amdocs.product.catalog.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ResilientAppController {
	private final ExternalAPICaller externalAPICaller;
}
