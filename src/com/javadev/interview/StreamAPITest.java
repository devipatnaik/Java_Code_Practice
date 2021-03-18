package com.javadev.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import org.w3c.dom.stylesheets.LinkStyle;

public class StreamAPITest {

	public static void main(String[] args) {
		/*
		 * write a program to print employee details in each department.
		 */

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "Devi", 231, "active", 60000));
		list.add(new Employee(102, "Raja", 233, "active", 50000));
		list.add(new Employee(103, "Amit", 233, "inactive", 33000));
		list.add(new Employee(104, "Shaan", 231, "active", 22000));
		list.add(new Employee(105, "Mitu", 233, "inactive", 18000));
		list.add(new Employee(106, "Little", 231, "active", 70000));
		list.add(new Employee(107, "Baby", 231, "inactive", 20000));

		// print employee details based on deptId.
		Map<Integer, List<Employee>> basedOnDeptId = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));

		basedOnDeptId.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "===" + entry.getValue());
		});

		System.out.println("*******************************");
		/*
		 * write a program to print employee count working on each department.
		 */

		Map<Integer, Long> countOnDeptId = list.stream()
				.collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));

		countOnDeptId.entrySet().forEach(entry -> {
			System.out.println("DEPT: " + entry.getKey() + "===Count===> " + entry.getValue());
		});

		System.out.println("*******************************");
		/*
		 * write a program to print active and inactive employee in the given
		 * collection.
		 */

		long statusActiveCount = list.stream().filter(p -> "active".equals(p.getStatus())).count();
		long statusInActiveCount = list.stream().filter(p -> "inactive".equals(p.getStatus())).count();
		System.out.println("Active Employee	  : " + statusActiveCount);
		System.out.println("InActive Employee : " + statusInActiveCount);

		System.out.println("*******************************");
		/*
		 * write a program to print Max/Min employee salary in the given collection.
		 */

		Optional<Employee> maxSalary = list.stream().max(Comparator.comparing(Employee::getSalary));
		Optional<Employee> minSalary = list.stream().min(Comparator.comparing(Employee::getSalary));
		
		Optional<Employee> maximumSal = list.stream().collect(Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))));
		
		System.out.println("Maximum Salary : " + maximumSal);
		System.out.println("Max Salary : " + maxSalary);
		System.out.println("Min Salary : " + minSalary);

		System.out.println("*******************************");
		/*
		 * write a program to print Max salary of an employee from each
		 * department.
		 */
		Map<Integer, Optional<Employee>> salaryBasedOnDept = list.stream()
		.collect(Collectors.groupingBy(Employee::getDeptId,
		Collectors.reducing(BinaryOperator
		.maxBy(Comparator.comparing(Employee::getSalary)))));

		salaryBasedOnDept.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "=====" + entry.getValue());
		});

		// salary greater than 30000
		List<Employee> sal = list.stream().filter(p -> p.getSalary() > 30000).collect(Collectors.toList());
		System.out.println("Salary is : " + sal);
		
		// Get all salary of employees
		List<Integer> salaryList = list.stream().map(e -> e.getSalary()).collect(Collectors.toList());
		System.out.println(salaryList);

	}

}
