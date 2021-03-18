package com.javadev.CollectionConvertion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapJava7 {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Devi", "BLR"));
		empList.add(new Employee(102, "Raja", "BLR"));
		empList.add(new Employee(104, "Shaan", "BLR"));
		empList.add(new Employee(103, "Suza", "BLR"));
		
		// List To Map Convert in Java 7
		Map<Integer, String> map = new HashMap<>();
		
		for (Employee employee : empList) {
			map.put(employee.getEmpId(), employee.getEmpName());
		}
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() +"===="+ entry.getValue());
		}

	}

}
