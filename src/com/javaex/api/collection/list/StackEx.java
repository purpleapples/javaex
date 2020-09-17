package com.javaex.api.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// stack declaration
		// LIFO
		Stack<Integer> stack = new Stack<> ();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Stack: " + stack);
		
		// peek :  show the last value
		System.out.println("peek: " + stack.peek());
		System.out.println("Stack: " + stack);
		
		// pop : pop
		int item = stack.pop();
		System.out.println("인출된 값: " + item);
		System.out.println("Stack: " + stack);
		
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}
		
		System.out.println("Stack:" + stack);
		
		while(!stack.empty()) { 
			System.out.println("POP : "+ stack.pop());
		}
			
	}

}

