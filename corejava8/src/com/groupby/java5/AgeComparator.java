package com.groupby.java5;

import java.util.Comparator;

import com.groupby.model.Person;

public class AgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		if (p1.getAge() == p2.getAge())
			return 0;
		if (p1.getAge() > p2.getAge())
			return 1;
		return -1;
	}
}