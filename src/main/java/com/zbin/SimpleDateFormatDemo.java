package com.zbin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * com.zbin.SimpleDateFormatDemo
 *
 * @author Zbin
 * @date 2019/04/30
 */

public class SimpleDateFormatDemo {

  private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  private static ThreadLocal<DateFormat> local = ThreadLocal
    .withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

//  private static Date parse(String strDate) throws Exception {
//    return local.get().parse(strDate);
//  }

  private static Date parse(String strDate) throws Exception {
    return local.get().parse(strDate);
  }

  public static void main(String[] args) throws Exception {
    ExecutorService service = Executors.newFixedThreadPool(100);
    for (int i = 0; i < 20; i++) {
      service.execute(() -> {
        for (int j = 0; j < 10; j++) {
          try {
            System.out.println(parse("2019-04-30 11:22:33"));
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
      });
    }
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("hello world");
      }
    }).start();

    new Thread(()->System.out.println("adfasfd")).start();

    Runtime.getRuntime().gc();
    service.shutdown();
    service.awaitTermination(1, TimeUnit.DAYS);
  }
}