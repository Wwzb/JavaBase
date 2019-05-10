package com.zbin.designpattern.strategypattern.example;

/**
 * com.zbin.designpattern.strategypattern.example.FlyWithWings
 *
 * @author Zbin
 * @date 2019/05/08
 */

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("Fly with wings");
  }

}
