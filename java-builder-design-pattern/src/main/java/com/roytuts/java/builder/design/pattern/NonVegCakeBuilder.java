package com.roytuts.java.builder.design.pattern;

public class NonVegCakeBuilder extends CakeBuilder {

	@Override
	public Cake createCake() {
		return new NonVegCake();
	}

	@Override
	public Ingredients mixIngredients() {
		return new NonVegCakeIngredients();
	}

	@Override
	public Bake bakeMixedIngredients() {
		return new NonVegCakeBake();
	}

	@Override
	public Frost frostCake() {
		return new NonVegCakeFrost();
	}

}
