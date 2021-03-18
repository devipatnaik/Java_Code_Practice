package com.javadev.HashMap;

import java.util.HashMap;
import java.util.Map;

public class KeyValueTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Raja", "SSE");
		Employee e2 = new Employee(104, "Ajit", "TL");
		Employee e3 = new Employee(103, "Tiku", "AM");
		
		Map<Employee, String> map = new HashMap<>();
		map.put(e1, "INDIA");
		map.put(e1, "INDIA");
		
		System.out.println(map.size());
		System.out.println(e1.hashCode()+" :: " + e2.hashCode());

	}

}
