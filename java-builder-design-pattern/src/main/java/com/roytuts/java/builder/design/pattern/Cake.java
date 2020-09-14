package com.roytuts.java.builder.design.pattern;

public abstract class Cake {

	protected Ingredients ingredients;
	protected Bake bake;
	protected Frost frost;

	public Ingredients getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}

	public Bake getBake() {
		return bake;
	}

	public void setBake(Bake bake) {
		this.bake = bake;
	}

	public Frost getFrost() {
		return frost;
	}

	public void setFrost(Frost frost) {
		this.frost = frost;
	}

	public abstract String getCake();

}
