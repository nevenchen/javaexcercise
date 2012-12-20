package com.neven.java.basic.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public double	a	= Math.random();

	public String toString() {
		return "" + a;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparatorDemo[] c = new ComparatorDemo[] { new ComparatorDemo(), new ComparatorDemo(), new ComparatorDemo() };
		System.out.println(Arrays.asList(c));
		List list = Arrays.asList(c);
		myCompare m = new myCompare();
		Collections.sort(list, m);
		System.out.println(Arrays.asList(c));
	}
}

class myCompare implements Comparator<ComparatorDemo> {

	public int compare(ComparatorDemo o1, ComparatorDemo o2) {
		// TODO Auto-generated method stub
		if (o1.a > o2.a)
			return 1;
		else
			return -1;
	}
}
