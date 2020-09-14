package com.roytuts.java.builder.design.pattern;

public abstract class CakeBuilder {

	protected Cake cake;
	protected Ingredients ingredients;
	protected Bake bake;
	protected Frost frost;

	public abstract Cake createCake();

	public abstract Ingredients mixIngredients();

	public abstract Bake bakeMixedIngredients();

	public abstract Frost frostCake();

}
