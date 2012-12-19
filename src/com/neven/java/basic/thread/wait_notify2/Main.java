package thread.wait_notify2;


public class Main {   
  
    public static void main(String[] args) throws InterruptedException {   
        Main main = new Main();   
        (new Thread(new MyThread(main))).start();   
        (new Thread(new MyThread(main))).start();   
        (new Thread(new MyThread(main))).start();   
        Thread.sleep(1000);   
        main.test2();   
        Thread.sleep(1000);   
        main.test3();   
        main.test3();   
        main.test3();   
    }   
       
    public synchronized void test3() throws InterruptedException{   
        System.out.println(Thread.currentThread().getName() + " test3()");   
        notify();   
    }   
       
    public synchronized void test2(){   
        for(int i=0; i<10; i++){   
            System.out.println(Thread.currentThread().getName() + " test2()");   
        }   
    }   
       
    public synchronized void test1() throws InterruptedException{   
        System.out.println(Thread.currentThread().getName() + " test1() start");   
        wait();   
        System.out.println(Thread.currentThread().getName() + " test1() end");   
    }   
}   

