package com.practice.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingUsingJava8 {
	public static void main(String args[]) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Amit", "Bangalore"));
		empList.add(new Employee(1, "Rohan", "Chennai"));
		empList.add(new Employee(1, "Anand", "Kerla"));
		empList.add(new Employee(1, "TOm", "Amld"));
		Collections.sort(empList);
		//empList.forEach(p -> {System.out.println(p.getAddress());});
		RatingCompartor ratingCompartor = new RatingCompartor();
		Collections.sort(empList, ratingCompartor);
		//or we can use anonymous class(a class which has no name is called anonymous class)
		Collections.sort(empList, new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return emp1.getName().compareTo(emp2.getName());
			}
		});
		//The above case is done by Anonymous class but we also can do it by using lambda function
		//lambda function can be applied on @FunctionalInterface (Which interface has only one abstract method is known as functional interface)
		//as like Runnable interface has only one abstract method that is run, and also Comparator interface has one abstract function that is compare
		//then we can use lambda expression on this interface
     Collections.sort(empList, (emp1, emp2) -> emp1.getAddress().compareTo(emp2.getAddress()));	
     	//This is the best way to use lambda here!!! 
		empList.forEach(p -> {System.out.println(p.getName());});
	}
}
