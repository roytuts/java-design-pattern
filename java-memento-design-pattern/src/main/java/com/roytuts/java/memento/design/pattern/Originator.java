package com.roytuts.java.memento.design.pattern;

public class Originator {

	private String state;

	public void set(String state) {
		System.out.println("Originator: Setting time to " + state);
		this.state = state;
	}

	public Memento saveToMemento() {
		System.out.println("Originator: Saving to Memento.");
		return new Memento(state);
	}

	public void restoreFromMemento(Memento memento) {
		this.state = memento.getState();
		System.out.println("Originator: Time restored from Memento: " + state);
	}

}
