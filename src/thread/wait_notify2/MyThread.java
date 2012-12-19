package thread.wait_notify2;


public class MyThread implements Runnable{   
  
    private Main main;   
       
    public MyThread(Main main){   
        this.main = main;   
    }   
       
    public void run() {   
        // TODO Auto-generated method stub   
        try {   
            main.test1();   
        } catch (InterruptedException e) {   
            // TODO Auto-generated catch block   
            e.printStackTrace();   
        }   
    }   
       
       
}  

