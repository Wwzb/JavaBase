package com.zbin.designpattern.strategypattern;

/**
 * com.zbin.designpattern.strategypattern.StrategyTest
 *
 * @author Zbin
 * @date 2019/05/09
 */

public class StrategyTest extends Context {

  private void setContext(Strategy st) {
    strategy = st;
  }

  private int doOperation(int var1, int var2) {
    return strategy.doOperation(var1, var2);
  }

  public static void main(String[] args) {
    StrategyTest test = new StrategyTest();
    test.setContext(new OperationAdd());
    System.out.println(test.doOperation(4, 2));
    test.setContext(new OperationSubstract());
    System.out.println(test.doOperation(3, 2));
    test.setContext(new OperationMultiply());
    System.out.println(test.doOperation(3, 5));
  }
}
