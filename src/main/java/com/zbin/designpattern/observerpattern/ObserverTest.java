package com.zbin.designpattern.observerpattern;

import java.util.Observable;
import java.util.Random;

/**
 * com.zbin.designpattern.observerpattern.ObserverTest
 *
 * @author Zbin
 * @date 2019/05/09
 */

public class ObserverTest extends Observable {

  public static void main(String[] args) {
    ObserverTest observerTest = new ObserverTest();
    observerTest.addObserver(new Observer1());
    observerTest.addObserver(new Observer2());
    for (int i = 0; i < 10; i++) {
      Random random = new Random();
      if (random.nextBoolean()) {
        observerTest.setChanged();
        observerTest.notifyObservers(i);
      }
    }
  }
}
