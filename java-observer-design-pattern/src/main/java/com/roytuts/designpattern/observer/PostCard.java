package com.roytuts.designpattern.observer;

public class PostCard implements Observer {

	@Override
	public void update(String message) {
		System.out.println("Updated status through Post card : " + message);
		System.out.println();
	}

}
