package com.neven.java.basic.thread.syn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author NevenChen
 * @date 2020/4/23 13:29
 * 几个知识点：
 * 1，一个类中多个synchronized方法，同一时刻，对该类的同一实例对象，只有一个synchronized方法会被执行。
 * 2，shutdown会拒绝线程池增加线程，等待已经执行的线程执行完毕
 * 3，shutdownNow会立即通过Thread.interrupt()尝试终止执行中的线程，执行中的线程走到sleep中时，会发现被interrupt
 * 4，如果线程中没有sleep 、wait、Condition、定时锁等应用，且异常没有被吞掉，Thread.interrupt()才能生效。
 */
public class InterruptTest {
  public synchronized void foo1() {
    System.out.println("foo1 begin");
    for (int i =0; i < 5; ++i) {
      System.out.println("foo1 ...");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("foo1 sleep is interrupted, msg=" + e.getMessage());
      }
    }
  }

  public synchronized void foo2() throws InterruptedException {
    System.out.println("foo2 begin");
    for (int i =0; i < 100; ++i) {
      System.out.println("foo2 ...");
      Thread.sleep(1000);
    }
  }
  public void foo3() {
    System.out.println("foo3 begin");
    for (int i =0; i < 5; ++i) {
      System.out.println("foo3 ...");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        System.out.println("foo3 sleep is interrupted, msg=" + e.getMessage());
      }
    }
  }
  public static void main(String[] args) {
    InterruptTest it = new InterruptTest();
//    InterruptTest it2 = new InterruptTest();
    ExecutorService es = Executors.newCachedThreadPool();
//    es.execute(() -> it.foo1());
//    es.execute(() -> it2.foo1());
    es.execute(() -> it.foo3());
//    es.execute(() -> {
//      try {
//        it.foo2();
//      } catch (InterruptedException e) {
//        System.out.println("foo2 is interrupted, msg=" + e.getMessage());
//      }
//    });
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    es.shutdownNow();
    // 切换到shutdown查看区别
    System.out.println("Main end");
  }

}
