package com.neven.java.basic;


public class ReferValue2 {
	
	public static void main(String[] args){
	    StringBuffer s= new StringBuffer("good");
	    StringBuffer s2=new StringBuffer("bad");
	    test(s,s2);
	    System.out.println(s);//9
	    System.out.println(s2);//10
    }

    static void test(StringBuffer s,StringBuffer s2) { //此时会在方法栈中新建引用，但指向同一内存地址
	    System.out.println(s);//1
	    System.out.println(s2);//2
	    s2=s;//3
	    s=new StringBuffer("new");//4
	    System.out.println(s);//5
	    System.out.println(s2);//6
	    s.append("hah");//7
	    s2.append("hah");//8
    }

}
