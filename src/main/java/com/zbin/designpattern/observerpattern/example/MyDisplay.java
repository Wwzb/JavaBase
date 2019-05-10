package com.zbin.designpattern.observerpattern.example;

/**
 * com.zbin.designpattern.observerpattern.example.MyDisplay
 *
 * @author Zbin
 * @date 2019/05/09
 */

public class MyDisplay implements Observer, DisplayElement {

  private float temp;
  private float humidity;
  private float pressure;

  public MyDisplay(Subject weatherData) {
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Temp:" + temp + ",Humidity:" + humidity + ",Pressure:" + pressure);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    this.display();
  }
}
