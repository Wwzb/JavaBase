package com.zbin.designpattern.decoratorpattern;

/**
 * com.zbin.designpattern.decoratorpattern.Rectangle
 *
 * @author Zbin
 * @date 2019/05/10
 */

public class Rectangle implements Shape {

  @Override
  public void draw() {
    System.out.println("Shape : Rectangle");
  }
}
