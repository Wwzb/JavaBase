package com.zbin.designpattern.decoratorpattern;

/**
 * com.zbin.designpattern.decoratorpattern.RedBorderDecorator
 *
 * @author Zbin
 * @date 2019/05/10
 */

public class RedBorderDecorator extends BorderDecorator{

  public RedBorderDecorator(Shape shape){
    super(shape);
  }

  @Override
  public void draw() {
    shape.draw();
    setRed();
  }

  private void setRed(){
    System.out.println("BorderColor : Red");
  }

  public static void main(String[] args) {
    Shape shape = new Circle();
    shape.draw();
    System.out.println("======");
    shape = new RedBorderDecorator(shape);
    shape.draw();
  }
}
