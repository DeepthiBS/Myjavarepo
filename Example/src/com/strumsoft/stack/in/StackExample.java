package com.strumsoft.stack.in;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("deepthi");
		stack.push("prathima");
		stack.push("sowmya");
		System.out.println("STACK :"+stack.toString());
		stack.pop();
		System.out.println("stack poped element :"+stack.toString());
		System.out.println("STACK PEEK :"+stack.peek());
	}
	

}
