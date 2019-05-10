package com.zbin.designpattern.decoratorpattern;

/**
 * com.zbin.designpattern.decoratorpattern.BorderDecorator
 *
 * @author Zbin
 * @date 2019/05/10
 */

public abstract class BorderDecorator implements Shape{

  Shape shape;

  public BorderDecorator(Shape shape){
    this.shape = shape;
  }

  @Override
  public void draw() {
    shape.draw();
  }
}
