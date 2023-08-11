package com.amdocs.product.catalog.model;

public class TaxResponse {
	private double taxAmount;
	private String taxType;
	
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