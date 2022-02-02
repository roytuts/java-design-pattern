package com.roytuts.java.memento.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> mementos = new ArrayList<>();

	public void addToMemento(Memento memento) {
		mementos.add(memento);
	}

	public Memento getFromMemento(int index) {
		return mementos.get(index);
	}

}
