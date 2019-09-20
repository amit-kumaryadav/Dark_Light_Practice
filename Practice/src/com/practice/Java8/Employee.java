package com.practice.Java8;

public class Employee implements Comparable<Employee>{
	Employee(){}
	
	public Employee(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
public int compareTo(Employee emp) {
	return this.address.compareTo(emp.getAddress());
}
}
