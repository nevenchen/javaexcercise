package com.neven.java.basic;
import java.util.Calendar;

/**
 * @Class�?
 * @Description:
 * switch(表达�?{
 *   case �?�?语句�?
 *   case �?�?语句�?
 * }
 * 表达式：只能是（byte,short,int,char,enum�?
 * �?，�?2：只能是（数字，常量，enum,不能是变量）
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 15 Nov 2010 15:34:16
 * Revision history:
 *
 * @see 	 
 */
public class SwitchTest {

	private static final int x = 1;
	public static void main(String[] args) {
		//switchConstants();
		switchEnum(Tools.FIRST);
	}
	
	static void switchConstants(){
		int i = 2;
		switch (i) {
			case  x :
				System.out.println(1);
			default:
				System.out.println("default");
				//break;
			case 2:
				System.out.println(2);
				// break;
			case 3:
				System.out.println(3);
				break;
		}
	}
	
	static void switchEnum(Tools tool){
		switch (tool) {
			   case JIA:
			    System.out.println(Tools.JIA);
			    break;
			   case JIAN:
			    System.out.println(Tools.JIAN);
			    break;
			   case FIRST:
			    System.out.println(Tools.FIRST);
			    break;
			   case LAST:
			    System.out.println(Tools.LAST);
			    break;
			   }
	}
	
	static enum Tools {
		JIA("+"), JIAN("-"), FIRST("first"), LAST("last");
		String symbol;

		Tools(String symbol) {
		   this.symbol = symbol;
		}

		public String toString() {
		   return symbol;
		}
	}

}
