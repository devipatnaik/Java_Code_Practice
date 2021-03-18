package com.javadev.fundamental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValueUsingJava8 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("Devi", 104);
		map.put("Raja", 187);
		map.put("Suza", 165);
		map.put("Amit", 121);

		Set<Entry<String, Integer>> set = map.entrySet();

		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(set);

		Collections.sort(list, (e1, e2) -> (e1.getValue().compareTo(e2.getValue())));
		
		for(Map.Entry<String, Integer> entry : list) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		}
	}
}
