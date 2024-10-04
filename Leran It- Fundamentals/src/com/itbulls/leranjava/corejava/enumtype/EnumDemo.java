package com.itbulls.leranjava.corejava.enumtype;


public class EnumDemo {

	public static void main(String[] args) {
		
		Priority priority = Priority.HIGH;
		
		switch(priority) {
		case HIGH:
			System.out.println("High priority");
			break;
		case MEDIUM:
			System.out.println("Medium priority");
			break;
		case LOW:
			System.out.println("Low priority");
			break;
		}
		
		System.out.println("==========Enum ValueOf=========");
		
		Priority priority2 = Priority.valueOf("HIGH");
		System.out.println(priority2);
		
		System.out.println("=========Enum Comaprison=========");
		System.out.println("Priority.HIGH == priority.Medium: " 
		+ (priority == Priority.MEDIUM));
		
		System.out.println("Priority.HIGH == Priority.HIGH: " 
		+ (priority == Priority.HIGH));
		
		System.out.println("===========Enum Oridinal()===========");
        
		System.out.println("Priority.HIGH.oridinal(): " + Priority.HIGH.ordinal());
		System.out.println("Priority.MEDIUM.oridinal(): " + Priority.MEDIUM.ordinal());
		
		System.out.println("==========Enum ieration============");
		
		Priority[] values = Priority.values();
		for(Priority priority3 : values) {
			System.out.println(priority3);	
		}
		
		System.out.println("===========Enum fields and Methods=============");
		
		System.out.println("Month.JANUARY.getDaysAmount(): " + Month.DECEMBER.getDaysAmount());
		
	}

}
