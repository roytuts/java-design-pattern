package com.roytuts.designpattern.observer;

public interface Subject {

	void registerObserver(Observer observer);

	void unregisterObserver(Observer observer);

	void notifyObservers();

}
