package com.zbin.designpattern.strategypattern;

/**
 * com.zbin.designpattern.strategypattern.RedHeadDuck
 *
 * @author Zbin
 * @date 2019/05/08
 */

public class RedHeadDuck extends Duck{

  @Override
  void display() {
    System.out.println("I'm red head");
  }

  public void setFlyBehavior(FlyBehavior fb){
    flyBehavior = fb;
  }

  public static void main(String[] args) {
    RedHeadDuck redHead = new RedHeadDuck();
    redHead.setFlyBehavior(()-> System.out.println("Im good"));
    redHead.swim();
    redHead.display();
    redHead.performFly();
  }
}
