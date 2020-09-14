package com.roytuts.java.builder.design.pattern;

public class CakeDirector {

	public Cake makeCake(CakeBuilder cakeBuilder) {
		Cake cake = cakeBuilder.createCake();
		System.out.println(cake.getCake());

		cake.setIngredients(cakeBuilder.mixIngredients());
		System.out.println(cake.getIngredients().getIngredients());

		cake.setBake(cakeBuilder.bakeMixedIngredients());
		System.out.println(cake.getBake().getBaked());

		cake.setFrost(cakeBuilder.frostCake());
		System.out.println(cake.getFrost().getFrost());

		return cake;
	}

}
