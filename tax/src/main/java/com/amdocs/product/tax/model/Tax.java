package com.amdocs.product.tax.model;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;  

@Entity
@Table
public class Tax {
	@Id	
	@Column
	private double amount;
	@Column
	private double taxAmount;
	@Column
	private String type;
	@Column
	private int percentage;

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
