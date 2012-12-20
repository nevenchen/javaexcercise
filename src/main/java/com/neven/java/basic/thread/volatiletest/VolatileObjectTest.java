package com.neven.java.basic.thread.volatiletest;


public class VolatileObjectTest {        
    public static void main(String[] args) {       
        final VolatileObjectTest volObj=new VolatileObjectTest();       
         Thread t2=new Thread(){       
            public void run(){       
                 System.out.println("t2 start");       
                for(;;){       
                         volObj.waitToExit();       
                 }       
             }       
         };       
         t2.start();       
         Thread t1=new Thread(){       
            public void run(){       
                 System.out.println("t1 start");       
                for(;;){       
                     volObj.swap();       
                 }       
             }       
         };       
         t1.start();       
     }       
      
     boolean boolValue;    
      
    // 加锁    
    public synchronized void waitToExit() {       
        if(boolValue == !boolValue) {    
          System.out.println("exit...");    
          System.exit(0);    
         }    
     }       
           
    // 加锁    
    public synchronized void swap() {    
         boolValue = !boolValue;       
     }       
      
}     

