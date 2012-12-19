package thread.tickets.sleep;


public class Test2 {
	    public static void main(String[] args) {   
	        final int count = 10;   
	        String[] abc = {"a", "b", "c"};   
	        for(int i=0; i<abc.length; i++) {   
	            final String current = abc[i];   
	            final String next = abc[(i+1)%abc.length];   
	            new Thread(new Runnable() {   
	                public void run() {   
	                    for(int j=0; j<count; j++) {   
	                        synchronized (current) {   
	                            // 等待信号   
	                            try { current.wait(); }    
	                            catch (InterruptedException e) {}   
	                            System.out.print(current);   
	                            // 给下个线程发信号   
	                            synchronized ( next ){ next.notify(); }   
	                        }   
	                    }   
	                }   
	            }).start();   
	        }   
	        // 通给第一个线程发信号   
	        synchronized ( abc[0] ){ abc[0].notify(); }   
	    }   

}
