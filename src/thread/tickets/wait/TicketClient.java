package thread.tickets.wait;


public class TicketClient {

	/**
	 * @Description:
	 *
	 * @author name: neven
	 * @param @param args
	 * @return void
	 * @throws InterruptedException 
	 * 
	 * @Exception:
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		lockOne();

	}
	
	static void lockOne(){
		ThreadTest   t=   new   ThreadTest(); 
		new   Thread(t, "Thread 1 ").start(); 
		new   Thread(t, "Thread 2 ").start(); 
		System.out.println("This cycle create only one locked object");
		synchronized(t){t.notify();}
	}
	
	static void lockMany(){
		ThreadTest   t1=   new   ThreadTest(); 
		ThreadTest   t2=   new   ThreadTest(); 
		new   Thread(t1, "Thread 1 ").start(); 
		new   Thread(t2, "Thread 2 ").start(); 
		System.out.println("This cycle create two locked objects");
	}
}
