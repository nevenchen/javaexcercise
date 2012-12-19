package codepiece;

import java.util.Stack;


public class StackTest {
	
	public static void main(String[] args){
		Stack<String> stack = new Stack<String>();
		//1: push
		stack.push("第1个String");
		stack.push("第2个String");
		stack.push("第3个String");
		stack.push("第4个String");
		stack.push("第5个String");
		
		//2: peek
		System.out.println(stack.peek());
		
		//3: search
		System.out.println("第4个String的位置："+stack.search("第4个String"));
		
		//4: pop
		stack.pop();
		System.out.println("stack 的大小： "+stack.size());
		System.out.println(stack.peek());
	}
}
