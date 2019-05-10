package com.zbin.designpattern.strategypattern.example;

/**
 * com.zbin.designpattern.strategypattern.example.Duck
 *
 * @author Zbin
 * @date 2019/05/08
 */

public abstract class Duck {

  FlyBehavior flyBehavior;

  void performFly(){
    flyBehavior.fly();
  }

  void swim(){
    System.out.println("I can swim");
  }

  abstract void display();
}
