package com.roytuts.java.singleton.design.pattern;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {

	private static final long serialVersionUID = 1L;

	private volatile static SingletonSerializable INSTANCE = null;

	public static SingletonSerializable getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SingletonSerializable();
		}
		return INSTANCE;
	}

	protected Object readResolve() {
		return INSTANCE;
	}

	private String name = "Soumitra";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
