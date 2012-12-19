package thread.notify;

import java.util.List;

public class Consume implements Runnable {

	private List	container	= null;
	private int		count;

	public Consume(List lst) {
		this.container = lst;
	}

	public void run() {
		while (true) {
			synchronized (container) {
				if (container.size() == 0) {
					try {
						System.out.println("222");
						container.wait();// 放弃锁
						System.out.println("sss");
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("lll");
				container.remove(0);
				container.notify();
				System.out.println("我吃了" + (++count) + "个");
			}
		}
	}
}
