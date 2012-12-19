package com.neven.java.basic.classtest;


/**
 * @Class：
 * @Description:对于静态变量、静态初始化块、变量、初始化块、构造器，
 * 它们的初始化顺序依次是（静态变量、静态初始化块）>（变量、初始化块）>构造器
 * TODO: 
 *
 * @author: Neven Chen
 * @Date	 8 Nov 2010 15:03:24
 * Revision history:
 *
 * @see 	 
 */
public class InitialOrderTest {  
	
	static{
		System.out.println("static method print....");
	}
	  
    // 静态变量   
    public static String staticField = "静态变量";   
    
    {System.out.println("non-static method print...");}
    
    // 变量   
    public String field = "变量";   
  
    // 静态初始化块   
    static {   
        System.out.println(staticField);   
        System.out.println("静态初始化块");   
    }   
  
    // 初始化块   
    {   
        System.out.println(field);   
        System.out.println("初始化块");   
    }   
  
    // 构造器   
    public InitialOrderTest() {   
        System.out.println("构造器");   
    }   
  
    public static void main(String[] args) {   
        new InitialOrderTest();   
    }   

}
