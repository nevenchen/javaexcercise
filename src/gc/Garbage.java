package gc;

import gc.Chair;

public class Garbage {

	public static void main(String[] args) throws InterruptedException {
		args = new String[10];
		args[0] = "before";
		//args[0] = "before";
		if (args.length == 0) {
			System.err.println("Usage: \n" + "java Garbage before\n or:\n" + "java Garbage after");
			return;
		}
		while (!Chair.f) {
			new Chair();
			new String("To take up space");
		}
		System.out.println("After all Chairs have been created:\n" + "total created = " + Chair.created + "， total finalized = " + Chair.finalized);
		
		
		
		
		if (args[0].equals("before")) {
			//System.out.println("gc():");
			System.gc();
			//System.out.println("runFinalization():");
			System.runFinalization();
		}
		ThreadGroup tGroup = Thread.currentThread().getThreadGroup();
//		tGroup.g
		new Chair().mainMethodSleeped = true;
		while(true) {Thread.currentThread().sleep(1000);}
//		System.out.println("bye!");
//		if (args[0].equals("after"))
//			System.runFinalizersOnExit(true);
	}
	
}
