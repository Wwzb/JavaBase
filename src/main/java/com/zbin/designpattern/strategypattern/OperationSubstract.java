package com.zbin.designpattern.strategypattern;

/**
 * com.zbin.designpattern.strategypattern.OperationSubstract
 *
 * @author Zbin
 * @date 2019/05/08
 */

public class OperationSubstract implements Strategy{

  @Override
  public int doOperaion(int var1, int var2) {
    return var1 - var2;
  }
}
