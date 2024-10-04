package com.itbulls.leranjava.corejava.oops.interafce;

public class ChasePaymentProcessor implements PaymentProcessor,  PaymentValidator{

	@Override
	public void processPayment(PaymentData payment) {
		/*
		String secureToken = ChaseApi.requestSecureTokenForApp();
		initPaymentPage(secureToken, payment.getPaymentAmount())
		*/
	}

	public boolean validatePayment(PaymentData payment){
        return false;
       }

}
