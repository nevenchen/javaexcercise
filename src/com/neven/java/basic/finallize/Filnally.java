package com.neven.java.basic.finallize;

public class Filnally {

	public static void main(String[] args) {
		System.out.println(tryCatch());
	}
	
	static String tryCatch(){
		try {
			return "I am a string from tryCatch()";
//			System.exit(1);
			//System.out.println("try was executed.");
		}
		finally {
			System.out.println("finally was executed.");
		}
		
	}
}
