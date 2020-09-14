package com.roytuts.java.builder.design.pattern;

public class CakeClient {

	public static void main(String[] args) {
		CakeDirector cakeDirector = new CakeDirector();

		// make a veg cake
		VegCakeBuilder vegCakeBuilder = new VegCakeBuilder();
		cakeDirector.makeCake(vegCakeBuilder);
		System.out.println();

		// make a non-veg cake
		NonVegCakeBuilder nonVegCakeBuilder = new NonVegCakeBuilder();
		cakeDirector.makeCake(nonVegCakeBuilder);
	}

}
