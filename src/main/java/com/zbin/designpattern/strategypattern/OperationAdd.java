package com.zbin.designpattern.strategypattern;

/**
 * com.zbin.designpattern.strategypattern.OperationAdd
 *
 * @author Zbin
 * @date 2019/05/08
 */

public class OperationAdd implements Strategy {

  @Override
  public int doOperation(int var1, int var2) {
    return var1 + var2;
  }
}
