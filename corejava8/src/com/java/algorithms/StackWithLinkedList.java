package com.java.algorithms;

public class StackWithLinkedList {

	public static void main(String[] args) {
		StackWithLinkedList swa = new StackWithLinkedList(5);
		swa.push(3);
		swa.push(8);
		swa.push(2);
		int peek = swa.peek();
		System.out.println(peek);
		int popvalue = swa.pop();
		System.out.println(popvalue);
	}

	int size;
	int top;
	int arr[];

	StackWithLinkedList(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int pushElement) {

		if (!isFull()) {
			top++;
			arr[top] = pushElement;
			System.out.println("Pushed element:" + pushElement);
		} else {
			System.out.println("Stack is full !");
		}
	}

	public int pop() {

		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];

		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}

	public int peek() {

		if (!this.isEmpty()) {
			System.out.println("Stack is Empty");
			return arr[top];
		} else
			System.out.println("Stack is Empty");
		return -1;
	}

	private boolean isFull() {
		return (size - 1 == top);
	}

	private boolean isEmpty() {
		return (top == -1);
	}

}
