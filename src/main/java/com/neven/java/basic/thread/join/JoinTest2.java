package com.neven.java.basic.thread.join;


class CustomThread1 extends Thread {       
    public CustomThread1() {       
        super("[********] Thread");       
    };       
    public void run() {       
        String threadName = Thread.currentThread().getName();       
        System.out.println(threadName + " start.");       
        try {       
            for (int i = 0; i < 5; i++) {       
                System.out.println(threadName + " loop at " + i);       
                Thread.sleep(1000);       
            }       
            System.out.println(threadName + " end.");       
        } catch (Exception e) {       
            System.out.println("Exception from " + threadName + ".run");       
        }       
    }       
}       
class CustomThread extends Thread {       
    CustomThread1 t1;       
    public CustomThread(CustomThread1 t1) {       
        super("[########] Thread");       
        this.t1 = t1;       
    }       
    public void run() {       
        String threadName = Thread.currentThread().getName();       
        System.out.println(threadName + " start.");       
        try {       
            t1.join();       
            System.out.println(threadName + " end.");       
        } catch (Exception e) {       
            System.out.println("Exception from " + threadName + ".run");       
        }       
    }       
}       
public class JoinTest2 {       
    public static void main(String[] args) {       
        String threadName = Thread.currentThread().getName();       
        System.out.println(threadName + " start.");       
        CustomThread1 t1 = new CustomThread1();       
        CustomThread t = new CustomThread(t1);       
        try {       
            t1.start();       
            t.start();  
            Thread.sleep(2000);       
            
            t.join();//Try to deprecated this line
        } catch (Exception e) {       
            System.out.println("Exception from main");       
        }       
        System.out.println(threadName + " end!");       
    }       
}      



