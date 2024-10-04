package com.itbulls.leranjava.corejava.oops.interafce;

import java.math.BigDecimal;

public class PaymentData {
        
	private int id;
	private BigDecimal paymentAmount;
	private BigDecimal taxAmount;
	private int userId;
	private String currency;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(BigDecimal paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(BigDecimal taxAmount) {
		this.taxAmount = taxAmount;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public PaymentData(int id, BigDecimal paymentAmount, BigDecimal taxAmount, int userId, String currency) {
		super();
		this.id = id;
		this.paymentAmount = paymentAmount;
		this.taxAmount = taxAmount;
		this.userId = userId;
		this.currency = currency;
	}
	
	

}
