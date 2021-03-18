package com.javadev.map;

import java.util.HashMap;
import java.util.Map;

public class NullCheckMap {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put(null, 153);
		map.put("Suza", 103);
		map.put(null, 101);   // 101 will print
		map.put("Amit", 117);
		
		Integer val = map.get(null);
		System.out.println("KEY "+val);
		
	}

}
