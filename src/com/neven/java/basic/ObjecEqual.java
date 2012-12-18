package com.neven.java.basic;

public class ObjecEqual {

	public static void main(String[] args) {
		yu yu1 = new yu();
		yu yu2 = new yu();
		yu yu3 = yu1;
		System.out.println(yu1.equals(yu2));
		System.out.println(yu1.hashCode());
		System.out.println(yu2.hashCode());
		System.out.println(yu1 == yu2);
		System.out.println(yu1 == yu3);
	}
}

class yu {
	public int hashCode() {
		return 1;
	}
}
