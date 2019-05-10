package com.zbin.designpattern.observerpattern.example;

/**
 * com.zbin.designpattern.observerpattern.example.Subject
 *
 * @author Zbin
 * @date 2019/05/09
 */

public interface Subject {

  void registerObserver(Observer o);

  void removeObserver(Observer o);

  void notifyObserver();
}
