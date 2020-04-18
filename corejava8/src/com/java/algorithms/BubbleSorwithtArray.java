package com.java.algorithms;

public class BubbleSorwithtArray {

	public static void main(String[] args) {
		int elements[] = { 100, 20, 3, 49, 6 };
		bubbleSortLogic(elements);
		for (int x : elements)
			System.out.println(x);
	}
	private static void bubbleSortLogic(int[] elements) {
		int n = elements.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (elements[j] > elements[j + 1]) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
	}
}