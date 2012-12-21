package com.neven.java.basic.primate;

import org.junit.Test;

public class Binary {

	/**
十进制里正负由符号决定。
例如5的反数为-5，加一个符号而已。
二进制中要得到一个数的反数遵循如下规则：
1：原数按位取反
2：取反所得加1

以5和-5为例子：
5的二进制为            0000 0101
1：原数按位取反 =》  1111 1010
2：取反所得加1  =》  1111 1011
所以5的二进制码为：0000 0101
负5的二进制码为：   1111 1011
	 * 
	 */
	@Test
	public void getMinusBinary(){
		int positive5 = 5;
		int negative5 = -5;
		System.out.println(Integer.toBinaryString(positive5));
		System.out.println(Integer.toBinaryString(negative5));
		
	}
	/**
	 * 结果为什么是65535而不是-1？
	 * 
	 * 窄的整型转换成较宽的整型时符号扩展规则：如果最初的数值类型是有符号的，那么就执行符号扩展（即如果符号位为1，则扩展为1，如果为零， 则扩展为0）；
	 * 如果它是char，那么不管它将要被提升成什么类型，都执行零扩展。
	 * 
	 * 了解上面的规则后，我们再来看看迷题：因为byte是有符号的类型，所以在将byte数值-1（二进制为：11111111）提升到char时，
	 * 会发生符号位扩展
	 * ，又符号位为1，所以就补8个1，最后为16个1；然后从char到int的提升时，由于是char型提升到其他类型，所以采用零扩展而不是符号扩展
	 * ，结果int数值就成了65535。
	 * 
	 * 如果将一个char数值c转型为一个宽度更宽的类型时，只是以零来扩展，但如果清晰表达以零扩展的意图，则可以考虑使用一个位掩码： int i = c
	 * & 0xffff;//实质上等同于：int i = c ;
	 * 
	 * 如果将一个char数值c转型为一个宽度更宽的整型，并且希望有符号扩展，那么就先将char转型为一个short，它与char上个具有同样的宽度，
	 * 但是它是有符号的： int i = (short)c;
	 * 
	 * 如果将一个byte数值b转型为一个char，并且不希望有符号扩展，那么必须使用一个位掩码来限制它： char c = (char)(b &
	 * 0xff);// char c = (char) b;为有符号扩展
	 */
	@Test
	public void baseTypeExtends() {
		System.out.println(Integer.toBinaryString(8));
		System.out.println((int) (char) (byte) -1);// 65535
		
		 byte bytes = -42;   
		 int result = bytes&0xff;   
		 System.out.println("无符号数: \t"+result);   
		 System.out.println("2进制bit位: \t"+Integer.toBinaryString(result));   
	}
}
