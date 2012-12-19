package com.neven.java.basic.finallize;

public class Chair {

	static boolean	gcrun		= false;
	static boolean	f			= false;
	static int		created		= 0;
	static int		finalized	= 0;
	
	static boolean  mainMethodSleeped = false;
	int				i;

	Chair() {
		i = ++created;
		if (created == 55)
			System.out.println("Created 55");
	}

	protected void finalize() {
		if (!gcrun) {
			gcrun = true;
			System.out.println("Beginning to finalize after " + created + " Chairs have been created");
		}
		if (i == 55) {
			System.out.println("Finalizing Chair #55， " + "Setting flag to stop Chair creation");
			f = true;
		}
		finalized++;
		if (finalized >= created)
			System.out.println("All " + finalized + " finalized");
		
		if(mainMethodSleeped)System.out.println("clear chair:" + i);
	}
}

