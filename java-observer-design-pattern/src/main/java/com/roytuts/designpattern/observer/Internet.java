package com.roytuts.designpattern.observer;

public class Internet implements Observer {

	@Override
	public void update(String message) {
		System.out.println("Updated status through Internet : " + message);
		System.out.println();
	}

}
