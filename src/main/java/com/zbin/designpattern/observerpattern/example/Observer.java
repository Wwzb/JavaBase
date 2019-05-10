package com.zbin.designpattern.observerpattern.example;

import java.util.Observable;

/**
 * com.zbin.designpattern.observerpattern.example.Observer
 *
 * @author Zbin
 * @date 2019/05/09
 */

public interface Observer {

  void update(float temp, float humidity, float pressure);

}
