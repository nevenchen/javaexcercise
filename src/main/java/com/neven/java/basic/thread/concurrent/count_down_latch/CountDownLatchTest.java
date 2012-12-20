package com.neven.java.basic.thread.concurrent.count_down_latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @Class：
 * @Description:
 * CountDownLatch是个计数器，它有一个初始数，等待这个计数器的线程必须等到计数器倒数到零时才可继续。
 * 比如说一个Server启动时需要初始化4个部件，Server可以同时启动4个线程去初始化这4个部件，
 * 然后调用CountDownLatch(4).await()阻断进入等待，每个线程完成任务后会调用一次CountDownLatch.countDown()
 * 来倒计数, 当4个线程都结束时CountDownLatch的计数就会降低为0，此时Server就会被唤醒继续下一步操作。
 * CountDownLatch的方法主要有：
	await()：使调用此方法的线程阻断进入等待 
	countDown(): 倒计数，将计数值减1 
	getCount(): 得到当前的计数值 

 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 2 Nov 2010 11:10:15
 * Revision history:
 *
 * @see 	 
 */
public class CountDownLatchTest {
	
	public static void main(String[] args) throws InterruptedException{

        System.out.println("Server is starting.");

        //初始化一个初始值为3的CountDownLatch

        CountDownLatch latch = new CountDownLatch(4);

        //起3个线程分别去启动3个组件

        ExecutorService service = Executors.newCachedThreadPool();

        service.submit(new ComponentThread(latch, 1));

        service.submit(new ComponentThread(latch, 2));

        service.submit(new ComponentThread(latch, 3));
        
        service.submit(new ComponentThread(latch, 4));

        service.shutdown();

        //进入等待状态
        System.out.println(Thread.currentThread().getName() + " thread now waiting for latch to active.");
        latch.await();

        //当所需的三个组件都完成时，Server就可继续了

        System.out.println("Server is up!");

  }


}
