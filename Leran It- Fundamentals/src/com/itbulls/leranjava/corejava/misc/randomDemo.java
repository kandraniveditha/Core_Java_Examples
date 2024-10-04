package com.itbulls.leranjava.corejava.misc;

import java.util.Random;

public class randomDemo {

	public static void main(String[] args) {

		Random r = new Random();
		System.out.println(r.nextInt());   //-94810226
		System.out.println(r.nextInt(100));  //67
		System.out.println(r.nextInt(100) + 1);   //81

		
	}

}
