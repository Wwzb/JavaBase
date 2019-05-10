package com.zbin.designpattern.decoratorpattern.example;

/**
 * com.zbin.designpattern.decoratorpattern.example.Mocha
 *
 * @author Zbin
 * @date 2019/05/10
 */

public class Soy extends CondimentDecorator {

  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  @Override
  public double cost() {
    return .10 + beverage.cost();
  }
}
