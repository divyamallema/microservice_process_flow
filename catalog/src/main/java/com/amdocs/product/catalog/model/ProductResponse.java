package com.amdocs.product.catalog.model;

import org.springframework.stereotype.Component;

@Component
public class ProductResponse {
//Add new ProductResponse (Model) Class with fields like id, name, type, price, taxType, taxAmount.
	private int id;
	private String name;
	private String type;
	private double price;
	private String taxType;
	private double taxAmount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	
}
