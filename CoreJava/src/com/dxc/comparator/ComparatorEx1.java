package com.dxc.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ComparatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee("Pankaj", 22, 2000));
		elist.add(new Employee("Prem", 34, 5000));
		elist.add(new Employee("Ajay", 20, 1000));

		elist.sort(new myComparator());
		Function<Employee, Integer> f = e-> e.getSalary();
		 Function<Employee, Integer> m=e->e.getAge();
		Comparator<Employee> ec = Comparator.comparing(Employee :: getSalary,(s1,s2)->s2.compareTo(s1));
		elist.sort(Comparator.nullsFirst(ec));
		elist.sort(ec);
		elist.listIterator().forEachRemaining((e)->System.out.println(e.getSalary()));

	}

}

class myComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSalary() - o2.getSalary();
	}

}

/*
 * class Manager {
 * 
 * private String name; private int age; private int salary;
 * 
 * Manager(String name,int age,int salary){ this.name=name; this.age=age;
 * this.salary=salary;
 * 
 * }
 * 
 * public String getName() { return name; } public void setName(String name) {
 * this.name = name; } public int getAge() { return age; } public void
 * setAge(int age) { this.age = age; } public int getSalary() { return salary; }
 * public void setSalary(int salary) { this.salary = salary; }
 * 
 * 
 * public int compareTo(Employee e) { // TODO Auto-generated method stub return
 * this.age-e.age; }
 * 
 * 
 * 
 * }
 */

class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private int salary;

	Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/*
	 * public int compareTo(Employee e) { // TODO Auto-generated method stub return
	 * this.age-e.age; }
	 */
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}

}