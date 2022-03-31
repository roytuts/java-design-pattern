package com.roytuts.java.proxy.design.pattern;

public class ProxyDebitCard implements Money {

	private DebitCard debitCard;
	private AuthService authService;

	public ProxyDebitCard(AuthService authService) {
		this.authService = authService;
		debitCard = new DebitCard();
	}

	@Override
	public void withdraw() {
		if (authService.isAuthenticated()) {
			debitCard.withdraw();
		} else {
			System.out.println("Go to Bank and withdraw money using receipt.");
		}
	}

}