package com.itbulls.leranjava.corejava.oops.inheritance;

public class Product {

	private int id;
	private String name;
	
	public int calculateRemainingAmount() {
		return 100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Product[] listVariants() {
		return new Product[3];
	}
}
