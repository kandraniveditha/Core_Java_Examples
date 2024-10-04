package com.itbulls.leranjava.corejava.Iterationstatements;

public class DoWhileLoop {

	public static void main(String[] args) {
		System.out.println("========do-while loop==========");
		int counter = 0;
		do {
			System.out.println("counter: " + counter++);
		}while (counter < 5);
		do {
			System.out.println("counter is five alrady: " + counter);
		}while (counter < 5);
	}

}
