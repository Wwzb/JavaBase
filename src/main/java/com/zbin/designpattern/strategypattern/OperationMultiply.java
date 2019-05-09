package com.zbin.designpattern.strategypattern;

/**
 * com.zbin.designpattern.strategypattern.OperationMultiply
 *
 * @author Zbin
 * @date 2019/05/08
 */

public class OperationMultiply implements Strategy {

  @Override
  public int doOperaion(int var1, int var2) {
    return var1 * var2;
  }
}
