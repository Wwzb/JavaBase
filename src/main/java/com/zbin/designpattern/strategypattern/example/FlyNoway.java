package com.zbin.designpattern.strategypattern.example;

/**
 * com.zbin.designpattern.strategypattern.example.FlyNoway
 *
 * @author Zbin
 * @date 2019/05/08
 */

public class FlyNoway implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("Fly no way");
  }

}
