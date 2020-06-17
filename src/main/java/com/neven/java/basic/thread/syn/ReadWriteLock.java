package com.neven.java.basic.thread.syn;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author NevenChen
 * @date 2020/6/4 14:09
 */
public class ReadWriteLock {
  private int i = 0;
  private int j = 0;

  private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
  Lock readLock = lock.readLock();
  Lock writeLock = lock.writeLock();

  public void out(){
    System.out.println(Thread.currentThread().getName()+"尝试获得锁");
    readLock.lock();
    System.out.println(Thread.currentThread().getName()+"进入out获得锁");
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(Thread.currentThread().getName()+"走过out sleep");
    System.out.println(Thread.currentThread().getName()+",(i="+i+"j="+j+")");
    readLock.unlock();
  }

  public void increase(){
    System.out.println(Thread.currentThread().getName()+"尝试获得锁");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    writeLock.lock();
    System.out.println(Thread.currentThread().getName()+"进入increase获得锁");
    try {
      i++;
      Thread.sleep(4000);
      System.out.println(Thread.currentThread().getName()+"走过increase sleep");
      j++;
    }catch (InterruptedException e){
      e.printStackTrace();
    }finally {
      writeLock.unlock();
    }

  }

  public static void main(String[] args) {
    ReadWriteLock reentrantReadWriteLockDemo = new ReadWriteLock();



    new Thread(()->{
      reentrantReadWriteLockDemo.out();
    },"读线程1").start();

    new Thread(()->{
      reentrantReadWriteLockDemo.increase();
    },"写线程3").start();

    new Thread(()->{
      reentrantReadWriteLockDemo.out();
    },"读线程2").start();
  }
}
