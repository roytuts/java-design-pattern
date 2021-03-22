package com.roytuts.java.singleton.design.pattern;

public class EagerSingletonInitialize {

	private static volatile EagerSingletonInitialize INSTANCE = new EagerSingletonInitialize();

	// private constructor to prevent creating object by other classes
	private EagerSingletonInitialize() {
	}

	public synchronized static EagerSingletonInitialize getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new EagerSingletonInitialize();
		}
		return INSTANCE;
	}

}
