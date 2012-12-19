package thread.excutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class ExcutorsTest {

	/**
	 * @Description:
	 *
	 * @author: Neven Chen
	 * @param @param args
	 * @return void
	 * 
	 * @Exception:
	 */
	private static  ExecutorService excutor ;
	public static void main(String[] args) {
//		executorsTest();
		scheduledThreadTest();
	}
	
	static void executorsTest(){
		excutor = Executors.newFixedThreadPool(5);
		for(int i = 0; i<10 ; i++){
			final int n = i;
			Runnable runner = new Runnable(){
				public void run() {
					System.out.println("I am runner "+ n);
					try {
						Thread.sleep(5000);
					}
					catch (InterruptedException e) {
					}
					System.out.println("Runner "+ n + " have wake up..");
				}
			};
			excutor.execute(runner);
		}
		excutor.shutdown();
	}
	
	static void scheduledThreadTest(){
		ScheduledExecutorService executor = (ScheduledExecutorService)Executors.newScheduledThreadPool(5);
		for(int i = 0; i<10 ; i++){
			final int n = i;
			Runnable runner = new Runnable(){
				public void run() {
					System.out.println("I am runner "+ n);
					try {
						Thread.sleep(5000);
					}
					catch (InterruptedException e) {
					}
					System.out.println("Runner "+ n + " have wake up..");
				}
			};
			executor.scheduleAtFixedRate(runner, 5, 5, TimeUnit.SECONDS);
			System.out.println("Runner begin in 10 second");
		}
		
	}
}
