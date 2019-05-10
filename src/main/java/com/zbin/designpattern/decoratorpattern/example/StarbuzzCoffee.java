package com.zbin.designpattern.decoratorpattern.example;

/**
 * com.zbin.designpattern.decoratorpattern.example.StarbuzzCoffee
 *
 * @author Zbin
 * @date 2019/05/10
 */

public class StarbuzzCoffee {

  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    System.out.println(beverage.getDescription() + " $" + beverage.cost());
    Beverage beverage1 = new HouseBlend();
    beverage1 = new Mocha(beverage1);
    beverage1 = new Mocha(beverage1);
    beverage1 = new Whip(beverage1);
    System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
  }
}
