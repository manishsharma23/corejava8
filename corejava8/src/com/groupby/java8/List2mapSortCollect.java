package com.groupby.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class List2mapSortCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<Employee> ls = new ArrayList<Employee>();
		ls.add(new Employee("Manish1", "z"));
		ls.add(new Employee("Manish2", "y"));
		ls.add(new Employee("Manish3", "x"));
		ls.add(new Employee("Manish4", "w"));

		Map result1 = ls.stream()
                .sorted(Comparator.comparing (Employee::getId))
                .collect(
                        Collectors.toMap(
                        		Employee::getName, Employee::getId, // key = name, value = websites
                                (oldValue, newValue) -> oldValue,       // if same key, take the old key
                                LinkedHashMap::new                      // returns a LinkedHashMap, keep order
                        ));

        System.out.println("Result 1 : " + result1);
        
		Map result2 = ls.stream()
                .sorted(Comparator.comparing (Employee::getName))
                .collect(
                        Collectors.toMap(
                        		Employee::getName, Employee::getId, // key = name, value = websites
                                (oldValue, newValue) -> oldValue,       // if same key, take the old key
                                LinkedHashMap::new                      // returns a LinkedHashMap, keep order
                        ));

        System.out.println("Result 2 : " + result2);
	}

}
