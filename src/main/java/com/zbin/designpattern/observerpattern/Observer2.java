package com.zbin.designpattern.observerpattern;

import java.util.Observable;
import java.util.Observer;

/**
 * com.zbin.designpattern.observerpattern.Observer1
 *
 * @author Zbin
 * @date 2019/05/09
 */

public class Observer2 implements Observer {

  @Override
  public void update(Observable o, Object arg) {
    System.out.println("Observer2 received" + arg);
  }
}
