package com.itbulls.leranjava.corejava.oops.interafce;

public interface PaymentProcessor {

	 int RETRY_ATTEPMPTS = 5;
	 
	 void processPayment(PaymentData payment);
	 
	 default void someDefaultMethod() {
		 System.out.println("This is the default Method");
	 }
	 
	 static void someStaticMethod() {
		 System.out.println("This is the static method");
	 }

}
