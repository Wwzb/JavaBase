package com.zbin;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * com.zbin.Test2
 *
 * @author Zbin
 * @date 2019/05/06
 */

public class Test2 {

  public final static ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT_THREAD_LOCAL = ThreadLocal
    .withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

  public final static SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat(
    "yyyy-MM-dd HH:mm:ss");

  private static Date parse(String time) {
    try {
      return SIMPLE_DATE_FORMAT.parse(time);
    } catch (ParseException e) {
      e.printStackTrace();
      return null;
    }
  }

  private static Date parse2(String time) {
    try {
      return SIMPLE_DATE_FORMAT_THREAD_LOCAL.get().parse(time);
    } catch (ParseException e) {
      e.printStackTrace();
      return null;
    }
  }

  private static Date parse3(String time) {
    try {
      return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time);
    } catch (ParseException e) {
      e.printStackTrace();
      return null;
    }
  }

  public static void main(String[] args) {
    String time = "2019-05-06 14:32:12";
    for (int i = 0; i < 50; i++) {
      new Thread(new Runnable() {
        @Override
        public void run() {
          System.out.println(parse3(time));
        }
      }).start();
    }
    ExecutorService service = Executors.newFixedThreadPool(10);
    service.execute(() -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("a");
      }
    });
    System.out.println(service.isShutdown());
    service.shutdown();
    System.out.println(service.isShutdown());
  }
}
