package co.java.genericexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class GeneraceDemo {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(2, 4, 6);
		double sum = sum(integers);
		
		System.out.println("Sum of integer = " + sum);
		System.out.println("=================================");
		List<Double> doubles = Arrays.asList(3.14, 1.68, 2.94);
		sum = sum(doubles);
		System.out.println("Sum of doubles = " + sum);
		System.out.println("=================================");
		List<Number> numbers = new ArrayList<Number>();
		append(numbers, 5);
		numbers.add(6.789);
		System.out.println(numbers);
	}

	public static void append(Collection<? super Integer> integers, int n) {
		for (int i = 0; i < n; i++)
			integers.add(i);
	}

	public static double sum(Collection<? extends Number> numbers) {
		double result = 0.0;
		for (Number num : numbers)
			result += num.doubleValue();
		return result;
	}
}