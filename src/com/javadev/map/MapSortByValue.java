package com.javadev.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapSortByValue {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		map.put("Devi", 153);
		map.put("Suza", 103);
		map.put("Raja", 101);
		map.put("Amit", 117);
		
		// print the sorted hashmap 
		/*for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		}*/
		
		Set<Entry<String, Integer>> set = map.entrySet();
		
		// Create a list from elements of HashMap 
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(set);
		
		// Sort the List
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
			
				return e1.getValue().compareTo(e2.getValue());
			}
		});
		
		// put data from sorted list to hashmap
		for(Map.Entry<String, Integer> entry : list) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		}
		
	}
}
