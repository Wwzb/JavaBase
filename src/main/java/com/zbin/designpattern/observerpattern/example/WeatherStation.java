package com.zbin.designpattern.observerpattern.example;

/**
 * com.zbin.designpattern.observerpattern.example.WeatherStation
 *
 * @author Zbin
 * @date 2019/05/09
 */

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
    MyDisplay myDisplay = new MyDisplay(weatherData);
    weatherData.setMeasurement(27.3F, 77.5F, 90);
    weatherData.setMeasurement(22.5F, 80.3F, 60);
    weatherData.setMeasurement(30.3F, 67.9F, 80);
  }
}
