package com.itbulls.leranjava.corejava.operations;

import java.util.Scanner;

public class ReadFormConsole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter any word: ");
		String word = sc.next();
		System.out.println("you entered this word: " + word);
		System.out.println("Please, enter any Integer number: ");
		int i = sc.nextInt();
		System.out.println("You entered this integer number: " + i);
	  /*
	   * Please, enter any word: 
        a
        you entered this word: a
	   */
	
	}

}
