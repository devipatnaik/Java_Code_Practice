package com.javadev.mapAndreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MapAndReduceTest {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,7,4);
		
		List<String> list1 = Arrays.asList("Corejava", "spring", "hibernate");
		
		// sum of elements using map
		Integer sum = list.stream().mapToInt(i->i).sum();
		System.out.println(sum);
		
		// sum of elements using reduce
		Integer sumreduce = list.stream().reduce(0, (a,b)->a+b);
		System.out.println(sumreduce);
		
		// sum of elements using reduce method reference
		Optional<Integer> reduceMethodRef = list.stream().reduce(Integer::sum);
		System.out.println(reduceMethodRef);
		
		// Multiplication of nos.
		Integer multiply = list.stream().reduce(1, (a,b)->a*b);
		System.out.println(multiply);
		
		Integer maxVal = list.stream().reduce(1, (a,b)->a>b?a:b);
		System.out.println(maxVal);
		
		Integer minVal = list.stream().reduce(1, (a,b)-> a < b ? a : b);
		System.out.println(minVal);
		
		Integer maxValueMethodReference = list.stream().reduce(Integer::max).get();
		System.out.println(maxValueMethodReference);
		
		// max length of a string
		String longestString = list1.stream().reduce((w1,w2) -> w1.length() > w2.length()?w1:w2).get();
		System.out.println(longestString);
		
		
		// get employee whose grade is "A" and get salary 
		double avgSal = EmployeeDB.getEmployees().stream().filter(e -> e.getGrade().equalsIgnoreCase("A"))
		.map(e -> e.getSalary())
		.mapToDouble(i->i)
		.average().getAsDouble();
		System.out.println(avgSal);
		
		// sum salary whose grade is "A"
		double sumSal = EmployeeDB.getEmployees().stream().filter(e -> e.getGrade().equalsIgnoreCase("A"))
		.map(e -> e.getSalary())
		.mapToDouble(i -> i)
		.sum();
		System.out.println(sumSal);
		
		// salary of all employees
		List<Double> salary = EmployeeDB.getEmployees().stream().map(Employee::getSalary)
				.collect(Collectors.toList());
		System.out.println(salary);
		
		// max salary whose grade is B
		OptionalDouble maxSal = EmployeeDB.getEmployees().stream().filter(p->p.getGrade().equalsIgnoreCase("B"))
		.map(e->e.getSalary())
		.mapToDouble(i->i)
		.max();
		System.out.println("Max Sal : "+maxSal);
	}

}
