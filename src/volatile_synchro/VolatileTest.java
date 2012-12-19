package volatile_synchro;

class TestThread extends Thread {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Thread#run()
	 */
	public void run() {
		while(this.i<10000000){
			this.one();
		}
		this.two();
	}

	//加volatile时j的更新总会比i慢
	//不加volatile是i,j的更新速度快慢是随机的
	static volatile  int	i	= 0, j = 0;

	static void one() {
		i++;
		j++;
	}

	static void two() {
		System.out.println("i=" + i + "   j=" + j);
	}
}

public class VolatileTest {

	public static void main(String[] args) throws Exception{
			Thread thread1 = new Thread(new TestThread());
			Thread thread2 = new Thread(new TestThread());
			thread1.start();
			thread2.start();
	}
}
