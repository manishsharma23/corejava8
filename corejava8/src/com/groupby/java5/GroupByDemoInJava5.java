package com.groupby.java5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.groupby.model.Person;

public class GroupByDemoInJava5 {
	public static void main(String[] args) {
		List<Person> plist = new ArrayList();
		plist.add(new Person("manish", "IT", "Amrica", 1000, 42));
		plist.add(new Person("bharti", "Com", "Cicago", 1500, 36));
		plist.add(new Person("happy", "Business", "Brazil", 2500, 10));
		plist.add(new Person("lisha", "scin", "Denmakr", 2500, 6));
		System.out.println("..unsorted...." + plist);

		Collections.sort(plist, new AgeComparator());
		System.out.println("..age...." + plist);

		Collections.sort(plist, new NameComparator());
		System.out.println("..name...." + plist);
	}
}