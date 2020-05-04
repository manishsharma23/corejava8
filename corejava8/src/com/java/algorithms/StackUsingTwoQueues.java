package com.java.algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues<E> {

	public static void main(String[] args) {
		StackUsingTwoQueues<Object> stack = new StackUsingTwoQueues<Object>();
		stack.push(20);
		stack.push(40);
		stack.push(70);
		stack.push(50);
		stack.push(90);
		stack.push(110);
		stack.push(30);
		System.out.println("Removed element : "+ stack.pop());
		stack.push(170);
		System.out.println("Removed element : "+ stack.pop());
	
	}

	Queue<E> queue1;
	Queue<E> queue2;

	StackUsingTwoQueues() {
		queue1 = new LinkedList<E>();
		queue2 = new LinkedList<E>();
	}

	public void push(E obj) {
		if (queue1.size() == 0)
			queue1.add(obj);
		else {

			int sizeOfqueue1 = queue1.size();
			for (int x = 0; x < sizeOfqueue1; x++)
				queue2.add(queue1.remove());
			queue1.add(obj);

			for (int y = 0; y < sizeOfqueue1; y++)

				queue2.add(queue2.remove());

		}

	}

	public Object pop() {
		if (queue1.size() == 0)
			System.out.println("queu is emplty ....");
		return queue1.remove();
	}
}
