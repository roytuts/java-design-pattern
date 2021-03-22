package com.roytuts.java.singleton.design.pattern;

public class SingletonStaticBlock {

	private static final SingletonStaticBlock INSTANCE;

	static {
		try {
			INSTANCE = new SingletonStaticBlock();
		} catch (Exception e) {
			throw new RuntimeException("Instance Error!", e);
		}
	}

	public static SingletonStaticBlock getInstance() {
		return INSTANCE;
	}

	// private constructor to prevent creating object by other classes
	private SingletonStaticBlock() {
	}

}
