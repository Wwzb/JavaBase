package com.zbin.collection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * com.zbin.collection.CollectionTest
 *
 * @author Zbin
 * @date 2019/04/24
 */

public class CollectionTest {


  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
//    list.add("b");
//    list.add("c");
//    System.out.println(list.toString());
//    list.remove("b");
//    System.out.println(list.toString());
    MyList<String> myList = new MyArrayList<>();
    myList.add("a");
    myList.add("b");
    myList.add("c");
    myList.add("d");
    myList.add("a");
    System.out.println(myList.get(2));
    System.out.println(myList.indexOf("a"));
    System.out.println(myList.lastIndexOf("a"));
  }
}
