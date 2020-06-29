package com.groupby.java8;

//https://mkyong.com/java8/java-8-convert-list-to-map/
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemoInJava8 {
	public static void main(String[] args) {
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
		System.out.println("================== sorted by name and count ============================");
		Map<Object, Long> byNameAndCount = plist.stream()
				.collect(Collectors.groupingBy(p -> p.getName(), Collectors.counting()));
		System.out.println(byNameAndCount);
		System.out.println("================== sorted by name ============================");
		Map<Object, String> byName = plist.stream().collect(
				Collectors.groupingBy(p -> p.getName(), Collectors.mapping(p -> p.getName(), Collectors.joining(","))));
		System.out.println(byName);
		System.out.println("--------------------------------------------");
		Map<Object, List<Person>> byName2 = plist.stream().collect(Collectors.groupingBy(p -> p.getName()));
		System.out.println(byName2);
		System.out.println("==================== sorted by name and age ==========================");
		Map<Object, Map<Object, String>> byNameAndage = plist.stream()
				.collect(Collectors.groupingBy(p -> p.getName(), Collectors.groupingBy(p -> p.getAge(),
						Collectors.mapping(p -> p.getName(), Collectors.joining(", ")))));
		System.out.println(byNameAndage);
		System.out.println("=================== sorted by department and age and name ===========================");
		Map<Object, Map<Object, String>> byDepartmentAndAge = plist.stream()
				.collect(Collectors.groupingBy(p -> p.getDepartment(), Collectors.groupingBy(p -> p.getAge(),
						Collectors.mapping(p -> p.getName(), Collectors.joining(", ")))));
		System.out.println(byDepartmentAndAge);
	}
}