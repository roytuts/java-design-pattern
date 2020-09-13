package com.roytuts.java.strategy.design.pattern.temperature;

public class StrategyPatternTest {

	public static void main(String[] args) {
		DayTemperature morningTemp = new MorningTemperature();
		DayTemperature noonTemp = new NoonTemperature();
		DayTemperature afterNoonTemp = new AfterNoonTemperature();
		DayTemperature eveningTemp = new EveningTemperature();
		DayTemperature nightTemp = new NightTemperature();

		DayTimeTemperature dayTime = new DayTimeTemperature(morningTemp);
		dayTime.showTemperature("10 Degree Celsius");

		dayTime = new DayTimeTemperature(noonTemp);
		dayTime.showTemperature("15 Degree Celsius");

		dayTime = new DayTimeTemperature(afterNoonTemp);
		dayTime.showTemperature("13 Degree Celsius");

		dayTime = new DayTimeTemperature(eveningTemp);
		dayTime.showTemperature("11 Degree Celsius");

		dayTime = new DayTimeTemperature(nightTemp);
		dayTime.showTemperature("9 Degree Celsius");
	}

}
