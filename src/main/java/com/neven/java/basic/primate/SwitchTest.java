package com.neven.java.basic.primate;
import java.util.Calendar;
import java.util.Random;

import org.junit.Test;

/**
 * switch(statement){
 *   case (condition):;break;
 *   case (condition):;break;
 * }
 * statement：只能是（byte,short,int,char,enum?
 * condition：只能是（数字，常量，enum,不能是变量）
 */
public class SwitchTest {

	private static final int x = 1;
	
	@Test
	public void switchConstants(){
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
	
	@Test
	public  void switchEnum(Tools tool){
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
	
	/**
	上面的程序目的是等概率的打印 Pain、Gain、Main 三个单词，但多次运行程序却发现永远只会打印 ain，这是为什么？

	第一个问题在于：rnd.nextInt(2)只会返回0、1 两个数字，所以上面只会走case 1: 的分支语句，case 2: 按理是永远不会走的。

	第二个问题在于：如果case语句不以break结束时，则一直会往向运行，即直到执行到break的case语句止，所以上面的的语句每次都会执行default分支语句。

	第三个问题在于：StringBuffer的构造函数有两种可接受参数的，一个是StringBuffer(int capacity)、另一个是StringBuffer(String str)，上面用的是StringBuffer(char)构造函数，实质上运行时将字符型转换成了int型，这样将字符当作StringBuffer的初始容量了，而不是字符本身。

		 */
		@Test
		public void caseStatementA(){
			Random rnd = new Random();
			StringBuffer word = null;
			switch (rnd.nextInt(2)) {
			case 1:
				word = new StringBuffer('P');
			case 2:
				word = new StringBuffer('G');
			default:
				word = new StringBuffer('M');
			}
			word.append('a');
			word.append('i');
			word.append('n');
			System.out.println(word);

		}

		@Test
		public void caseStatementB(){
			Random rnd = new Random();
			StringBuffer word = null;
			switch (rnd.nextInt(3)) {
			case 1:
				word = new StringBuffer("P");
				break;
			case 2:
				word = new StringBuffer("G");
				break;
			default:
				word = new StringBuffer("M");
				break;// 可以不要

			}
			word.append('a');
			word.append('i');
			word.append('n');
			System.out.println(word);
		}

}
