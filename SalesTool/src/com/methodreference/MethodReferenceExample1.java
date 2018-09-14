package com.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// example();
		System.out.println("================================================================");
		example_1();
		System.out.println("================================================================");

		System.out.println("================================================================");

	}

	public static void example_1() {

		List<Integer> numbers = Arrays.asList(20, 10, 15, 24, 55, 47, 16, 87, 88);

		numbers.stream().map((n) -> EvenOddCheck.isEven(n)).forEach((n -> System.out.println(n)));

	}

	public static void example() {
		Pridecte p = (n) -> EvenOddCheck.isEven(n);

		System.out.println(p.Test(20));

		Pridecte q = EvenOddCheck::isEven;

		System.out.println(q.Test(45));

	}

}
