package com.groupby.model;

import java.util.Objects;

public class Person {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int hash = 7;
		hash = 79 * hash + Objects.hashCode(this.name);
		hash = 79 * hash + Objects.hashCode(this.department);
		hash = 79 * hash + Objects.hashCode(this.city);
		hash = 79 * hash + Objects.hashCode(this.salary);
		hash = 79 * hash + this.age;
		return hash;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj.getClass() != getClass())
			return false;
		final Person other = (Person) obj;
		if (!Objects.equals(this.name, other.name))
			return false;
		if (!Objects.equals(this.city, other.city))
			return false;
		if (this.salary != other.salary)
			return false;
		if (this.age != other.age)
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format(name,department,city,"%s(%s,%d)", "%s(%s,%d)");
	}

	public Person(String name, String department, String city, int salary, int age) {
		this.name = name;
		this.department = department;
		this.city = city;
		this.salary = salary;
		this.age = age;
	}

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	String department;
	String city;
	int salary;
	int age;

}
