package com.groupby.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//https://mkyong.com/java8/java-8-convert-list-to-map/
public class Parallel_stream_sorted_reverse {
	public static void main(String[] args) {
		parallaDemo();
		System.out.println("================================================");
		parallalSorting();
	}
	public static void parallalSorting() {
		Integer[] intArray = { 1, 2, 3, 0, 5, 6, 7, 8 };
		List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
		System.out.println("listOfIntegers:");
		listOfIntegers.stream().forEach(e -> System.out.print(e + " "));
		System.out.println("");
		System.out.println("listOfIntegers sorted in reverse order:");
		Comparator<Integer> normal = Integer::compare;
		Comparator<Integer> reversed = normal.reversed();
		Collections.sort(listOfIntegers, reversed);
		listOfIntegers.stream().forEach(e -> System.out.print(e + " "));
		System.out.println("");
		System.out.println("Parallel stream");
		listOfIntegers.parallelStream().forEach(e -> System.out.print(e + " "));
		System.out.println("");
		System.out.println("Another parallel stream:");
		listOfIntegers.parallelStream().forEach(e -> System.out.print(e + " "));
		System.out.println("");
		System.out.println("With forEachOrdered:");
		listOfIntegers.parallelStream().forEachOrdered(e -> System.out.print(e + " "));
		System.out.println("");
	}

	public static void parallaDemo() {
		List<Person> plist = new ArrayList();
		plist.add(new Person("manish", "IT", "Amrica", 1000, 42));
		plist.add(new Person("manish", "IT", "India", 1000, 43));
		plist.add(new Person("manish2", "IT", "India", 1000, 10));
		plist.add(new Person("happy", "IT", "India", 1000, 9));
		plist.add(new Person("happy", "IT", "India", 1000, 8));
		plist.add(new Person("bharti", "BU", "Cicago", 1500, 36));
		plist.add(new Person("happy", "ST", "Brazil", 2500, 10));
		plist.add(new Person("lisha", "ST", "Denmakr", 2500, 6));
		System.out.println("==================== unsorted ==========================");
		System.out.println(plist);
		double age = plist.stream().parallel().filter(p -> p.getDepartment() == "IT").mapToInt(Person::getAge).average()
				.getAsDouble();
		System.out.println("==================== age ==========================");
		System.out.println(+age);
		System.out.println("================== sorted by name ============================");
		Map<String, List<Person>> byNames = plist.stream().collect(Collectors.groupingBy(Person::getName));
		System.out.println(byNames);
	}
}