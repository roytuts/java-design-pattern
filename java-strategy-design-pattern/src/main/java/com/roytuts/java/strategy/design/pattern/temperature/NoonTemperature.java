package com.roytuts.java.strategy.design.pattern.temperature;

public class NoonTemperature implements DayTemperature {

	@Override
	public void displayTemperature(String temp) {
		System.out.println("Today's temperature at noon : " + temp);
	}

}
