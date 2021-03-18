package com.javadev.fundamental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByKeyUsingJava8 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();

		map.put("Devi", 104);
		map.put("Raja", 187);
		map.put("Suza", 165);
		map.put("Amit", 121);
		
		// in java 7
		Map<String, Integer> sortMapkey = new TreeMap<String, Integer>(map);

		Set<Entry<String, Integer>> set = map.entrySet();
		
		System.out.println("Before Sorting : ");
		//System.out.println(map);
		
		for(Entry<String, Integer> entry : set) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		}
		System.out.println("After Sorting : ");
		//System.out.println(sortMapkey);
		
		System.out.println("***********************************************");
		// in java 8
		Set<Entry<String, Integer>> set8 = map.entrySet();
		
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set8);
		
		Collections.sort(list, (e1, e2) -> e1.getKey().compareTo(e2.getKey()));
		
		for(Entry<String, Integer> entry : list) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		}
		
	}

}
