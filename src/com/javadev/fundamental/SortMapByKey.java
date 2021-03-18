package com.javadev.fundamental;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKey {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("Devi", 104);
		map.put("Raja", 187);
		map.put("Suza", 165);
		map.put("Amit", 121);
		
		TreeMap<String, Integer> tm = new TreeMap<>(map);

		for (Map.Entry<String, Integer> entry : tm.entrySet()) {

			System.out.println("Key : " + entry.getKey() + "::" + " Value : " + entry.getValue());

		}

	}

}
