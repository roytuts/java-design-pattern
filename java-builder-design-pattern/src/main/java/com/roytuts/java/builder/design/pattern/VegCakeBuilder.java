package com.roytuts.java.builder.design.pattern;

public class VegCakeBuilder extends CakeBuilder {

	@Override
	public Cake createCake() {
		return new VegCake();
	}

	@Override
	public Ingredients mixIngredients() {
		return new VegCakeIngredients();
	}

	@Override
	public Bake bakeMixedIngredients() {
		return new VegCakeBake();
	}

	@Override
	public Frost frostCake() {
		return new VegCakeFrost();
	}

}
