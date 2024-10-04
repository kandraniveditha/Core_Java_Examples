package com.itbulls.leranjava.corejava.jumpstatements;

public class JumpStatements {

	public static void main(String[] args) {
	System.out.println("========continue=======");
	for(int i = 0; i < 5; i++) {
		if(i % 2 == 0) {
			continue;
		}
		System.out.println("counter: " + i);
	}
	System.out.println("======== Break ========");
	for(int i = 0; i<5; i++) {
		if(i == 3) {
			break;
		}
		System.out.println("counter: " + i);
	}
	
	System.out.println("======Break nested loop=======");
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j< 5; j++) {
			if(j == 3) {
				break;
			}
			System.out.print(j + " ");
		}
		System.out.println("counter: " + i);
	}
	}

}
