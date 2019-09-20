package com.practice.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class BaseRunnerForEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "amit");
		Employee emp2 = new Employee(1, "anand");
		Employee emp3 = new Employee(1, "archna");
//		HashSet<Employee> empSet = new HashSet<>();
//		empSet.add(emp1);
//		empSet.add(emp2);
//		empSet.add(emp3);
//		empSet.forEach(v -> System.out.println((v)));
//		HashMap<Employee, Integer> mapOfEmployee = new HashMap<>();
//		mapOfEmployee.put(emp1, 1);
//		mapOfEmployee.put(emp2, 2);
//		mapOfEmployee.put(emp3, 3);
//		mapOfEmployee.forEach((k,v) -> System.out.println((k + ":" + v)));
		TreeMap<Employee, Integer> treeEmp = new TreeMap<>();
		treeEmp.put(emp1, 1);
		treeEmp.put(emp2, 2);
		treeEmp.put(emp3, 3);
		treeEmp.forEach((k,v) -> System.out.println((k + ":" + v)));
	}

}
