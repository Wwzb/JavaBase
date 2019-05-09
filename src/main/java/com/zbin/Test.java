package com.zbin;

import com.sun.istack.internal.NotNull;
import com.sun.org.apache.bcel.internal.generic.RET;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import sun.security.provider.MD5;

/**
 * com.zbin.Test
 *
 * @author Zbin
 * @date 2019/04/29
 */

public class Test {

  @NotNull
  private String good;

  private boolean success;

  public String getGood() {
    return good;
  }

  public void setGood(String good) {
    this.good = good;
  }

  public void saySome(@NotNull String words) {
    System.out.println(words);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Test)) {
      return false;
    }
    Test test = (Test) o;
    return success == test.success &&
      getGood().equals(test.getGood());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getGood(), success);
  }

  public static void main(String[] args) throws Exception {

    List<String> list2 = new ArrayList<>();
    list2.add("1");
    list2.add("2");
    list2.removeIf((String s) -> "2".equals(s));
    People people1 = new People(10,"w");
    People people2 = new People(30,"z");
    People people3 = new People(20,"b");
    List<People> peopleList = new ArrayList<>();
    peopleList.add(people1);
    peopleList.add(people2);
    peopleList.add(people3);
    System.out.println(peopleList.toString());
    Collections.sort(peopleList,(o1, o2) -> o1.age - o2.age);
    Map<String,String> map = new HashMap<>();
    map.put("a","w");
    map.put("b","z");
    map.put("c","b");
    map.forEach(new BiConsumer<String, String>() {
      @Override
      public void accept(String s, String s2) {
        System.out.println(s + s2);
      }
    });
    map.forEach((s1,s2) -> System.out.println(s1 + ":" + s2));
//    peopleList.sort((o1,o2) -> o1.age - o2.age);
    System.out.println(peopleList.toString());
    //这是一个注释
    // 这是一个注释
    String var1 = "Boomsdfas";
    String var2 = "bob";
    Objects.equals(var1, var2);
    System.out.println(var1.indexOf("sda"));
    System.out.println(0X10FFFF);
    System.out.println(var1.hashCode());
    System.out.println();
    System.out.println(var1.regionMatches(1, var2, 1, 1));
    System.out.println(new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒SSS毫秒").format(new Date()));
    Thread.sleep(3000);
    System.out.println(new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒SSS毫秒").format(new Date()));
    if (var1.regionMatches(1, var2, 1, 1)) {
      return;
    }
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    Test test = new Test();
    System.out.println(list);
    Method method = list.getClass().getMethod("add", Object.class);
    method.setAccessible(true);
    method.invoke(list, "hello world");
    method.invoke(list, test);
    System.out.println(list);
    System.out.println(test);
    System.out.println(Integer.toHexString(test.hashCode()));
    Object object = new Object();
    char[] chars = {'a', 'b', 'c'};
    String news = new String(chars, 1, 2);
    test.setGood(null);
    System.out.println(test.getGood());
    test.saySome(null);
    int i = 8;
    System.out.println(i >> 5);
    String cond = "\uD835\uDD46";
    System.out.println(cond);
    System.out.println(cond.length());
    String tests = "你好";
    System.out.println(tests.codePointAt(0));
  }
}
class People{

  int age;

  String name;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public People(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "People{" +
      "age=" + age +
      ", name='" + name + '\'' +
      '}';
  }
}