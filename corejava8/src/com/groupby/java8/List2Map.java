package com.groupby.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//https://mkyong.com/java8/java-8-convert-list-to-map/
public class List2Map {
	public static void main(String[] args) {
		unikKeyainMap();
		unUnicKeyainMap();
	}

	public static void unUnicKeyainMap() {
		List<Person> lsPerson = new ArrayList<Person>();
		lsPerson.add(new Person("manish", "IT", "pune", 89000, 42));
		lsPerson.add(new Person("manish", "IT", "pune", 89000, 42));
		lsPerson.add(new Person("manish", "IT", "pune", 89000, 42));
		lsPerson.add(new Person("manish", "IT", "pune", 89000, 42));
		lsPerson.add(new Person("manish", "IT", "pune", 89000, 42));
		lsPerson.forEach(p -> p.getName().toString());
		Map<String, String> map = (Map<String, String>) lsPerson.stream()
				.collect(Collectors.toMap(Person::getName, Person::getCity, (oldvalue, newvalue) -> oldvalue));
		System.out.println("unUnicKeyainMap...." + map);
	}

	public static void unikKeyainMap() {
		List<Person> lsPerson = new ArrayList<Person>();
		lsPerson.add(new Person("manish", "IT", "pune", 89000, 42));
		lsPerson.add(new Person("manish1", "IT1", "pune", 99000, 42));
		lsPerson.add(new Person("manish2", "IT2", "pune", 79000, 42));
		lsPerson.add(new Person("manish3", "IT3", "pune", 19000, 42));
		lsPerson.add(new Person("manish4", "IT4", "pune", 9000, 42));
		Map<String, String> map2 = (Map<String, String>) lsPerson.stream()
				.collect(Collectors.toMap(Person::getName, Person::getDepartment));
		System.out.println("unikKeyainMap..." + map2);
		System.out.println("=========================S=======================");
		lsPerson.stream().filter(emp -> emp.getSalary() > 10000).forEach(System.out::println);
		System.out.println("=========================E=======================");
		System.out.println("=========================S 1 =======================");
		// List<Person> filteredList =
		lsPerson.stream().filter(emp -> emp.getSalary() > 10000).collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("=========================E 2 =======================");
		Map<Object, String> newlogic = lsPerson.stream().filter(p -> p.getAge() > 30).collect(
				Collectors.groupingBy(p -> p.getName(), Collectors.mapping(p -> p.getName(), Collectors.joining(","))));
		System.out.println("......" + newlogic);
	}
}

class Employee {
	String name;

	public Employee(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	String id;
}