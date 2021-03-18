package com.javadev.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashCode {

	public static void main(String[] args) {
	
		Employee e1 = new Employee(101, "SBI");
		Employee e2 = new Employee(101, "SBI");
		
		Map<Employee, String> map = new HashMap<>();
		map.put(e1, "Bank");
		map.put(e2, "Bank");
		
		System.out.println("Object Size : "+map.size());
		//System.out.println(map.entrySet());
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(i1, "one");
		map1.put(i2, "one");
		
		System.out.println(map1.size());
	}

}
