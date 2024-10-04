package com.itbulls.leranjava.corejava.oops.interafce;

public class PayPalPaymentProcessor implements PaymentProcessor{


	@Override
	public void processPayment(PaymentData payment) {
		/*
		PayPalForm paymentForm = PayPalApi.getPaymentFormByAppId(APP_ID);
		fillPaymentForm(paymentForm, payment);
		paymentForm.submit();
		*/
	}

}
