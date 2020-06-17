package com.neven.java.basic.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author NevenChen
 * @date 2020/4/26 9:10
 */
public class ReentrantTest {

  ReentrantTest() {
  }

  Lock lock = new ReentrantLock();

  public static void main(String[] args) {
  }

  public void testLock(){

    lock.lock();
  }
}
