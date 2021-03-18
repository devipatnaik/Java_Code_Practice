package com.javadev.CollectionConvertion;

import static java.util.stream.Collectors.toMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ListToMapJava8 {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Devi", "BLR"));
		empList.add(new Employee(102, "Raja", "BLR"));
		empList.add(new Employee(104, "Shan", "BLR"));
		empList.add(new Employee(103, "Suza", "BLR"));
		
		// List To Map Convert in Java 8
		Map<Integer, String> toMap = empList.stream().collect(toMap(Employee::getEmpId, Employee::getEmpName));
		System.out.println(toMap);
	}

}
