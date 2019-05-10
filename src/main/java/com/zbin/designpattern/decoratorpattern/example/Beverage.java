package com.zbin.designpattern.decoratorpattern.example;

/**
 * com.zbin.designpattern.decoratorpattern.example.Beverage
 *
 * @author Zbin
 * @date 2019/05/10
 */

public abstract class Beverage {

  String description = "Unknow Beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

}
