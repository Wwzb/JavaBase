package com.zbin.designpattern.decoratorpattern.example;

/**
 * com.zbin.designpattern.decoratorpattern.example.Espresso
 *
 * @author Zbin
 * @date 2019/05/10
 */

public class Espresso extends Beverage {

  public Espresso(){
    description = "Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}
