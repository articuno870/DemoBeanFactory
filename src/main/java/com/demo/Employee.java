package com.demo;

public class Employee {
	private String name;
	private int age;
	
	

	public Employee() {
		super();
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	public void printEmp() {
		System.out.println("employee print");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	// standard constructors, getters and setters
}
