package com.roytuts.java.singleton.design.pattern;

public class SingletonLazyInitialize {

	private static volatile SingletonLazyInitialize INSTANCE = null;

	// private constructor to prevent creating object by other classes
	private SingletonLazyInitialize() {
	}

	public static SingletonLazyInitialize getInstance() {
		if (INSTANCE == null) {
			synchronized (SingletonLazyInitialize.class) {
				INSTANCE = new SingletonLazyInitialize();
			}
		}
		return INSTANCE;
	}

}
