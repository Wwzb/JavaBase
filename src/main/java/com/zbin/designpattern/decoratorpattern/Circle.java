package com.zbin.designpattern.decoratorpattern;

/**
 * com.zbin.designpattern.decoratorpattern.Circle
 *
 * @author Zbin
 * @date 2019/05/10
 */

public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("Shape : Circle");
  }
}
