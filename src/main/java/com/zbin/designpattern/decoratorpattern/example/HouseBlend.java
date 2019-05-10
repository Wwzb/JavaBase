package com.zbin.designpattern.decoratorpattern.example;

/**
 * com.zbin.designpattern.decoratorpattern.example.Espresso
 *
 * @author Zbin
 * @date 2019/05/10
 */

public class HouseBlend extends Beverage {

  public HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public double cost() {
    return .89;
  }
}
