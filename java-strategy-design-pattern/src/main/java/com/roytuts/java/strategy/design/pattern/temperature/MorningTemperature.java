package com.roytuts.java.strategy.design.pattern.temperature;

public class MorningTemperature implements DayTemperature {

	@Override
	public void displayTemperature(String temp) {
		System.out.println("Today's temperature at morning : " + temp);
	}

}
