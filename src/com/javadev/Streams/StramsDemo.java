package com.javadev.Streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StramsDemo {

	public static void main(String[] args) {
		
		List<Employee> employee = Arrays.asList(
			new Employee("Jhon", 30, new BigDecimal(10000)),
			new Employee("Marco", 23, new BigDecimal(30000)),
			new Employee("Juliya", 27, new BigDecimal(50000))
		);
	
		List<ExEmployee> result = employee.stream().map(temp -> {

			ExEmployee ex = new ExEmployee();
			ex.setName(temp.getName());
			ex.setAge(temp.getAge());

			if ("Marco".equals(temp.getName())) {
				ex.setExtra("This field for Marco only!");
			}
			return ex;
		}).collect(Collectors.toList());
		System.out.println(result);
		
		List<String> nameResult = employee.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println(nameResult);
	}
}
