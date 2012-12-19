package thread.notify;

import java.util.ArrayList;
import java.util.List;

public class MultiThread {

	private List			container	= new ArrayList();
	public final static int	MAX			= 5;

	public static void main(String args[]) {
		MultiThread m = new MultiThread();
		new Thread(new Consume(m.getContainer())).start();
//		new Thread(new Product(m.getContainer())).start();
//		new Thread(new Consume(m.getContainer())).start();
//		new Thread(new Product(m.getContainer())).start();
	}

	public List getContainer() {
		return container;
	}

	public void setContainer(List container) {
		this.container = container;
	}
}
