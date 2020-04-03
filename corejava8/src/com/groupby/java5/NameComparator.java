package com.groupby.java5;

import java.util.Comparator;

import com.groupby.model.Person;

public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		
		return p1.getName().compareTo(p2.getName());
	}
}