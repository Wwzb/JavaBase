package com.zbin.designpattern.strategypattern;

/**
 * com.zbin.designpattern.strategypattern.FlyNoway
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
