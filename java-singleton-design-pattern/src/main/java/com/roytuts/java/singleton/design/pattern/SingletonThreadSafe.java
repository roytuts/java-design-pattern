package com.roytuts.java.singleton.design.pattern;

public class SingletonThreadSafe {

	private static volatile SingletonThreadSafe INSTANCE = null;

	// private constructor to prevent creating object by other classes
	private SingletonThreadSafe() {
	}

	public static SingletonThreadSafe getInstance() {
		if (INSTANCE == null) {
			synchronized (SingletonThreadSafe.class) {
				// Double check
				if (INSTANCE == null) {
					INSTANCE = new SingletonThreadSafe();
				}
			}
		}
		return INSTANCE;
	}

}
