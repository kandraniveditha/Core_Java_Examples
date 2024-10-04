package com.itbulls.leranjava.corejava.Iterationstatements;

public class NestedLoop {

	public static void main(String[] args) {
     System.out.println("=========Nested Loop========");
     for (int i=0; i<5; i++) {
    	 System.out.println("*** i= " + i + "***");
    	 for (int j=0; j<3; j++) {
    		 System.out.println(j + "\t");
    	 }
    	 System.out.println();
     }


	}

}
