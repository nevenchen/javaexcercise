package com.neven.java.basic.codepiece;

import java.util.Stack;


public class StackTest {
	
	public static void main(String[] args){
		Stack<String> stack = new Stack<String>();
		//1: push
		stack.push("?个String");
		stack.push("?个String");
		stack.push("?个String");
		stack.push("?个String");
		stack.push("?个String");
		
		//2: peek
		System.out.println(stack.peek());
		
		//3: search
		System.out.println("?个String的位置："+stack.search("?个String"));
		
		//4: pop
		stack.pop();
		System.out.println("stack 的大小： "+stack.size());
		System.out.println(stack.peek());
	}
}
