package com.practice.main;

public class Employee implements Comparable<Employee>{
	public Employee(int empId, String empName) {
		this.employeeId = empId;
		this.name = empName;
	}

	private int employeeId;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result +(this.getName() == null ? 0: this.getName().hashCode());
		result = result+ +(this.getEmployeeId() == 0 ? 0 : this.getEmployeeId());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Employee emp = (Employee) obj;
		if(emp.getEmployeeId() == this.getEmployeeId() && emp.getName().equals(this.getName())) {
			return true;
		}
		return false;
	}
@Override
public int compareTo(Employee emp) {
	if(emp == null)
		return 0;
	if(emp.getEmployeeId() == this.getEmployeeId() && emp.getName().equals(this.getName()))
		return -1;
	return 1;
}
}
