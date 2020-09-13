package com.roytuts.java.strategy.design.pattern.payment;

public class StrategyPatternTest {

	public static void main(String[] args) {
		double price = 34560;// goods price in Rs

		Payment debitCardPayment = new DebitCardPayment();
		Payment creditCardPayment = new CreditCardPayment();
		Payment payPalPayment = new PayPalPayment();

		PaymentStrategy paymentStrategy = new PaymentStrategy(debitCardPayment);
		paymentStrategy.payAmount(price);

		paymentStrategy = new PaymentStrategy(creditCardPayment);
		paymentStrategy.payAmount(price);

		paymentStrategy = new PaymentStrategy(payPalPayment);
		paymentStrategy.payAmount(price);
	}

}
