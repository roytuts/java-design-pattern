package com.roytuts.java.proxy.design.pattern;

public class DebitCard implements Money {

	@Override
	public void withdraw() {
		System.out.println("Money withdrawn using Debit Card");
	}

}