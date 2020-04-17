package com.java.algorithms;

public class StackClient {

	public static void main(String[] args) {
		StackinJava<Integer> stack = new StackinJava<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
	}
}