package com.zbin;

/**
 * com.zbin.SingleIns
 *
 * @author Zbin
 * @date 2019/05/06
 */

public class SingleIns {


  private static SingleIns singleIns;

  private SingleIns() {

  }

  public static SingleIns getInstance() {
    if (singleIns == null) {
      synchronized (SingleIns.class) {
        if (singleIns == null) {
          singleIns = new SingleIns();
        }
      }
    }
    return singleIns;
  }

}
