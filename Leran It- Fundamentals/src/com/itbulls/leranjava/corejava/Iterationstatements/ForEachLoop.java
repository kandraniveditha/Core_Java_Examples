package com.itbulls.leranjava.corejava.Iterationstatements;

public class ForEachLoop {

	public static void main(String[] args) {
		System.out.println("========For Each loop=======");
		int[] arr = {1, 2, 3};
		int sum = 0;
		for (int number : arr) {
			sum += number;
			System.out.println("Number: " + number);
		}
		System.out.println("Sum: " + sum);

	}

}
