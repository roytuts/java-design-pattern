package com.roytuts.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class RecruitmentStatus implements Subject {
	
	private String type;
	private String name;
	private String status;
	
	private List<Observer> observers = new ArrayList<Observer>();

	public RecruitmentStatus(String type, String name, String status) {
		this.type = type;
		this.name = name;
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		notifyObservers();
	}

	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			System.out.println("Notifying observers on change of status of the recruitment procedure");
			observer.update(status);
		}
	}

}
