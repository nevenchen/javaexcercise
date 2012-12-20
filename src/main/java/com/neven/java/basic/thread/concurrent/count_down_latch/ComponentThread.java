package com.neven.java.basic.thread.concurrent.count_down_latch;

import java.util.concurrent.CountDownLatch;

public class ComponentThread implements Runnable{

    CountDownLatch latch;

    int ID;

    /** Creates a new instance of ComponentThread */

    public ComponentThread(CountDownLatch latch, int ID) {

          this.latch = latch;

          this.ID = ID;

    }

    public void run() {

          System.out.println("Component "+ID + " initialized!");

          //将计数减一

          latch.countDown();
          System.out.println("Component "+ID + " get latch count: " + latch.getCount());

    }     

}

