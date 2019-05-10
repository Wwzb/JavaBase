package com.zbin.designpattern.observerpattern.example;

import java.util.ArrayList;

/**
 * com.zbin.designpattern.observerpattern.example.WeatherData
 *
 * @author Zbin
 * @date 2019/05/09
 */

public class WeatherData implements Subject {

  private ArrayList<Observer> observers;
  private float temp;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObserver() {
    for (Observer observer : observers) {
      observer.update(temp, humidity, pressure);
    }
  }

  public void measurementsChanged() {
    this.notifyObserver();
  }

  public void setMeasurement(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    this.measurementsChanged();
  }


}
