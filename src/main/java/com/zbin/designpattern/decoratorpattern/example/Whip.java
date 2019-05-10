package com.zbin.designpattern.decoratorpattern.example;

/**
 * com.zbin.designpattern.decoratorpattern.example.Mocha
 *
 * @author Zbin
 * @date 2019/05/10
 */

public class Whip extends CondimentDecorator {

  Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }

  @Override
  public double cost() {
    return .15 + beverage.cost();
  }
}
