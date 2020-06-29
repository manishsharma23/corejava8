package com.groupby.java8;

//https://mkyong.com/java8/java-8-convert-list-to-map/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("1a");
		myList.add("2d");
		myList.add("3g");
		myList.add("4h");
		myList.add("5j");
		// myList.forEach(System.out::println);
		Iterator<String> it = myList.iterator();
		while (it.hasNext()) {
			String value = it.next();
		}
		myList.forEach(System.out::println);
		myList.forEach(name -> System.out.println(name));
	}
}