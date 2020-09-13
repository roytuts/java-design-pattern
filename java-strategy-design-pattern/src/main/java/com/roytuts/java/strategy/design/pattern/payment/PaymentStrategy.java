package com.roytuts.java.strategy.design.pattern.payment;

public class PaymentStrategy {

	private Payment payment;

	public PaymentStrategy(Payment payment) {
		this.payment = payment;
	}

	public Payment getPayment() {
		return payment;
	}

	public void payAmount(double amount) {
		payment.pay(amount);
	}

}
