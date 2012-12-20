package com.neven.java.basic;

public class ForEachTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		People people = new ForEachTest().new People();
//		for(String s : people.getFriends()){
//			System.out.println(s);
//		}
		StringBuilder emails = new StringBuilder();
		System.out.println(emails.toString()+"]]]");
	}
	
	class People{
		String[] friends;
		public String[] getFriends(){
			return null;
		}
	}

}
