package com.groupby.java8;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List2Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee("Manish", "1"));
		ls.add(new Employee("Manish", "1"));
		ls.add(new Employee("Manisha", "2"));
		ls.add(new Employee("Manish", "1"));

		ls.add(new Employee("Manishb", "3"));

		ls.add(new Employee("Manishc", "4"));
		ls.forEach(p -> p.getId().toString());

		System.out.println(ls.toString());
		Map<String, String> map = (Map<String, String>) ls.stream()
				.collect(Collectors.toMap(Employee::getId, Employee::getName,(oldvalue,newvalue)->oldvalue));

		System.out.println(map);
	
	//	Map<String, String> map2 = (Map<String, String>) ls.stream()
		//		.collect(Collectors.toMap(Employee::getId, Employee::getName,()));

	
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