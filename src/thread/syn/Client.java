package thread.syn;


public class Client {

	/**
	 * @Description:
	 *
	 * @author name: Neven
	 * @param @param args
	 * @return void
	 * 
	 * @Exception:
	 */
	public static void main(String[] args) {
		final Target target = new Target();
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				target.methodA();
				target.methodB();
				target.methodC();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run() {
				target.methodC();
				target.methodB();
			}
		});
		t1.start();
		t2.start();
	}
	
	
}
