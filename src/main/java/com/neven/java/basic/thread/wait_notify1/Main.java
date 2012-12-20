package com.neven.java.basic.thread.wait_notify1;


public class Main {   
	  /*MyThread.run中调用synchronized void test1() ，这时对main对象加锁
		main.test2()要等待main锁释放。
		结论：1：当对象处于sleep状态：当某线程调用该对象的某synchronized 修饰的方法时，会对该对象加锁。
		         其他对象在调用该对象其他synchronized 修饰方法时要等该获得该对象锁。
		     2：当对象处于wait状态： 当该对象的某方法在wait中时，其他线程依然可调用该对象的任意方法（wait会释放该对象的锁）
		        其他线程若要激活该方法，可以调用该对象的notify方法
		     3:当一个线程中的某个方法执行了wait，则该线程进入阻塞状态
	   * */
   
    /**
     * @Description:
     *
     * @author: Neven Chen
     * @param @param args
     * @param @throws InterruptedException
     * @return void
     * 
     * @Exception:
     */
    public static void main(String[] args) throws InterruptedException {   
        final Main main1 = new Main();   
        (new Thread(new MyThread(main1),"main1")).start(); 
        /*1: Thread.sleep(800);
         * 
         * Thread.sleep() 是对主进程main的sleep， main和main1是竞争的关系，
         * 当注释掉“Thread.sleep(800);”后main1会立即竞争到资源进入test1（）的休眠；
         * 不注释“Thread.sleep(800);”是main的优先级别高会先进入"Thread.sleep(800);"完毕后继续执行后面的程序。
         * 
         * $$$$
         */
        Thread.sleep(800); 
        
        /*2:　main.test2();
         * 
         * 当“Thread.sleep(800);”被注释，main会抢占到资源“main1.test2()”会被执行，
         * 反之由于main1在test1（）的休眠中，而test2（）和test1（）同为main1的syn方法，所以必须等待test（）1，结束
         * 
         * $$$$以上结论是在test1()在sleep（）状态下，如果为wait（）由于wait会释放资源，test1（）,或test2都依然会执行
         *
         */
        main1.test2();
        
        new Thread("NofifyThread"){
        	 public void run(){
        		try {
        			System.out.println("NofifyThread is bolcked。");
					main1.test3();
        			
					System.out.println("NofifyThread is bolcked, so can i be printed ?");
				}
				catch (InterruptedException e) {
					e.printStackTrace();
				}
        	}
        }.start();
        
        
        
        /* ３：main1.test4();
         * 
         * 主要用来测试当main1竞争到资源且还在阻塞中时，由于test4()不是syn方面，在main获取资源的情况下test4（）依然
         * 会被执行
         */
        
        main1.test4();

        /*Thread.yield();
         *
         * 释放当前线程锁拥有的资源，给其他线程执行的机会
         */
        
        Thread.yield();
        
        System.out.println("Now going to nofify.");
        synchronized(main1){
			main1.notifyAll();
		}
        
        /*4: main2
         * 
         * 主要测试不能main1的syn方面有没有被阻塞，main2的所有方法都可以被调用（包括syn方法）
         * 
         */
        Main main2 = new Main();
        main2.test2();
    }   
       
    /**
     * @Description:用来测试当test1在wait状态时，用notify激活该方法
     *
     * @author: Neven Chen
     * @param @throws InterruptedException
     * @return void
     * 
     * @Exception:
     */
    public synchronized void test3() throws InterruptedException{   
        System.out.println(Thread.currentThread().getName() + " test3()");   
        this.notify();
        wait();   
    }   
       
    public synchronized void test2(){   
            System.out.println(Thread.currentThread().getName() + " test2()");   
    }   
       
    public synchronized void test1() throws InterruptedException{   
        System.out.println(Thread.currentThread().getName() + " test1() start");   
//        wait();   
        Thread.sleep(5000);   
        System.out.println(Thread.currentThread().getName() + " test1() end");   
    }   
    
    public void test4(){
    	System.out.println("test4 is running.");
    }
}  

