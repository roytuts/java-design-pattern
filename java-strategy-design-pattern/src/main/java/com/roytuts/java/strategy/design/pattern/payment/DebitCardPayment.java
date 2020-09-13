package com.roytuts.java.strategy.design.pattern.payment;

public class DebitCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		amount -= amount * 1.5 / 100;// discount 1.5 percent
		System.out.println("Payable amount using Debit Card: Rs. " + amount);
	}

}
