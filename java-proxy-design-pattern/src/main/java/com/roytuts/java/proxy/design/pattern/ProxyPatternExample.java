package com.roytuts.java.proxy.design.pattern;

public class ProxyPatternExample {

	public static void main(String[] args) {
		Money money1 = new ProxyDebitCard(new AuthService(true));
		money1.withdraw();

		Money money2 = new ProxyDebitCard(new AuthService(false));
		money2.withdraw();
	}

}