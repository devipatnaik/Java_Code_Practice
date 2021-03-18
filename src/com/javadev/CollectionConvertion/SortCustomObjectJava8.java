package com.javadev.CollectionConvertion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortCustomObjectJava8 {

	public static void main(String[] args) {
		
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Devi", "BLR"));
		empList.add(new Employee(102, "Raja", "BLR"));
		empList.add(new Employee(104, "Shan", "BLR"));
		empList.add(new Employee(103, "Suza", "BLR"));
		
		empList.forEach(System.out::println);
		
		List<Employee> emp = empList.stream().sorted(Comparator.comparing(Employee::getEmpId)).collect(Collectors.toList());
		System.out.println(emp);
	}

}
