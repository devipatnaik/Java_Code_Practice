package com.javadev.mapAndreduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {
	
	public static List<Employee> getEmployees() {
		return Stream.of(
				new Employee(101,"Raja","A",60000),
				new Employee(103,"Shaan","B",40000),
				new Employee(102,"Peter","B",20000),
				new Employee(104,"Amit","A",80000),
				new Employee(106,"Suza","B",30000)).collect(Collectors.toList());
				
	}

}
