package com.itbulls.leranjava.corejava.oops.inheritance;

public class Phone extends Product {
	
	//default constructor
	public Phone() {
		super();
		System.out.println("Some code");
	}
	
	public void ring() {
		System.out.println("Ring!");
	}
	@Override
	public Product[] listVariants() {
		throw new UnsupportedOperationException();
	}
	
	public int calculateAmountOfVariants() {
		return super.listVariants().length;
	}

}
