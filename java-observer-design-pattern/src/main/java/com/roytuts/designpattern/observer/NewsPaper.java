package com.roytuts.designpattern.observer;

public class NewsPaper implements Observer {

	@Override
	public void update(String message) {
		System.out.println("Updated status through News paper : " + message);
		System.out.println();
	}

}
