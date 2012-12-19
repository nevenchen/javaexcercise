package thread.interrupted;


public class InterruptedTest {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		checkWith_isInterrupted(Thread.currentThread());
//		checkWithInterrupted();
		System.out.println("end.");
	}
	
	/**
	 * @Description:Thread.interrupted()为Thread的静态方法，调用它首先会返回当前线程的中断状态
	 * （如果当前线程上调用了interrupt()方法，则返回true，否则为false），然后再清除当前线程的中断状态，
	 * 即将中断状态设置为false。换句话说，如果连续两次调用该方法，则第二次调用将返回 false。
	 *
	 * @author: Neven Chen
	 * @param 
	 * @return void
	 * 
	 * @Exception:
	 */
	static void checkWithInterrupted(){
		if(Thread.interrupted()){
			System.out.println("interrupted:" + Thread.interrupted());
		}
		else{
			System.out.println("not interrupted.");
		}
	}
	
	/**
	 * @Description:isInterrupted()方法为实例方法，测试线程是否已经中断，并不会清除当前线程中断状态。
	 *
	 * @author: Neven Chen
	 * @param @param thread
	 * @return void
	 * 
	 * @Exception:
	 */
	static void checkWith_isInterrupted(Thread thread){
		if(thread.isInterrupted()){
			System.out.println("interrupted:" + thread.isInterrupted());
		}
		else{
			System.out.println("not interrupted.");
		}
	}
}
