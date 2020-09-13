package com.roytuts.java.strategy.design.pattern.payment;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		amount -= amount * 3 / 100;// 3% discount
		System.out.println("Payable amount using Credit Card: Rs. " + amount);
	}

}
