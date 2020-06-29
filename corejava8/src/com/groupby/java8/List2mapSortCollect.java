package com.groupby.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List2mapSortCollect {
	// https://mkyong.com/java8/java-8-convert-list-to-map/
	public static void main(String[] args) {
		List<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee("Manish1", "z"));
		ls.add(new Employee("Manish2", "y"));
		ls.add(new Employee("Manish3", "x"));
		ls.add(new Employee("Manish4", "w"));
		Map<String, String> result1 = ls.stream().sorted(Comparator.comparing(Employee::getId))
				.collect(Collectors.toMap(Employee::getName, Employee::getId, // key = name, value = websites
						(oldValue, newValue) -> oldValue, // if same key, take the old key
						LinkedHashMap::new // returns a LinkedHashMap, keep order
				));
		System.out.println("Result 1 : " + result1);
		List<Person> lsPerson = new ArrayList<Person>();
		lsPerson.add(new Person("manisha", "IT", "pune", 89000, 21));
		lsPerson.add(new Person("manishz", "IT", "pune", 89000, 34));
		lsPerson.add(new Person("manishb", "IT", "pune", 89000, 2));
		lsPerson.add(new Person("manishm", "IT", "pune", 89000, 4));
		lsPerson.add(new Person("manishc", "IT", "pune", 89000, 42));
		Map<String, String> result2 = (Map<String, String>) lsPerson.stream()
				.sorted(Comparator.comparing(Person::getAge))
				.collect(Collectors.toMap(Person::getName, Person::getDepartment, // key = name, value = websites
						(oldValue, newValue) -> oldValue, // if same key, take the old key
						LinkedHashMap::new // returns a LinkedHashMap, keep order
				));
		System.out.println("Result 2 : " + result2);
	}
}