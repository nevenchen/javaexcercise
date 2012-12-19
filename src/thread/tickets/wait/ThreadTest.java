package thread.tickets.wait;

public class ThreadTest implements Runnable {

	private int	tickets	= 10;

	public void run() {
		while (true) {
			synchronized (this) {
				if (tickets > 0) {
					try {
						System.out.println(Thread.currentThread().getName()+"is going to wait.");
						this.wait();
						System.out.println("I have get notify.");
					}
					catch (Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println(Thread.currentThread().getName() + "正在买第 " + tickets-- + "号票 ");
				}
				else{break;}
			}
		}
		System.out.println(Thread.currentThread().getName() +"  have stoped");
	}
}
