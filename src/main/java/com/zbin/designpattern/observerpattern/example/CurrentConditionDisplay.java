package com.zbin.designpattern.observerpattern.example;

/**
 * com.zbin.designpattern.observerpattern.example.CurrentConditionDisplay
 *
 * @author Zbin
 * @date 2019/05/09
 */

public class CurrentConditionDisplay implements Observer, DisplayElement {

  private float temperature;
  private float humidify;
  private Subject weatherData;

  public CurrentConditionDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out
      .println("Current conditions:" + temperature + "°C degree and " + humidify + "% humidity");
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidify = humidity;
    this.display();
  }
}
