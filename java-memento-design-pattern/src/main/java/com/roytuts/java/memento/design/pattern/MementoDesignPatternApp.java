package com.roytuts.java.memento.design.pattern;

public class MementoDesignPatternApp {

	public static void main(String[] args) {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.set("1 year ago");

		careTaker.addToMemento(originator.saveToMemento());

		originator.set("6 months ago");

		careTaker.addToMemento(originator.saveToMemento());

		originator.set("7 days ago");

		careTaker.addToMemento(originator.saveToMemento());

		originator.restoreFromMemento(careTaker.getFromMemento(0));

		originator.restoreFromMemento(careTaker.getFromMemento(1));

		originator.restoreFromMemento(careTaker.getFromMemento(2));
	}

}
