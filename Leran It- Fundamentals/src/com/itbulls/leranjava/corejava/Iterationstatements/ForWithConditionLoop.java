package com.itbulls.leranjava.corejava.Iterationstatements;

public class ForWithConditionLoop {

	public static void main(String[] args) {
		System.out.println("===========For Loop=========");
		for (int i=0; i< 5; i++) {
			System.out.println("counter: " +i);
		}
		//Infinity loop
//		System.out.println("===========For Loop=========");
//		for (int i=0; i< 5;) {
//			System.out.println("counter: " +i);
	//	i++
//	}
		//for(;;){}
		
		
		System.out.println("=======for loop | comma usage example");
		for(int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("counters: i = " + i + ", i = " + i);
			
		}

	}

}
