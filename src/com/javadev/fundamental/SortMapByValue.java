package com.javadev.fundamental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapByValue {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Devi", 104);
		map.put("Raja", 187);
		map.put("Suza", 165);
		map.put("Amit", 121);
		
		HashMap<String, Integer> map1 = sortByValue(map);
		
		for(Map.Entry<String, Integer> entry : map1.entrySet()) {
			
			System.out.println("Key : "+entry.getKey()+"::"+" Value : "+entry.getValue());
			
		}
	}

	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> map) {
		
		 List<Map.Entry<String, Integer> > list = new ArrayList<Map.Entry<String, Integer> >(map.entrySet()); 
		 
		 Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			
			public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
				return (e1.getValue().compareTo(e2.getValue()));
			}
		});
		 
		 
		 /*Collections.sort(list, ( e1,  e2) ->
					 (e1.getValue().compareTo(e2.getValue())));
		*/
			
		
		 
		 HashMap<String, Integer> listMap = new LinkedHashMap<String, Integer>();
		 
		 for(Map.Entry<String, Integer> listEntry : list) {
			 
			 listMap.put(listEntry.getKey(), listEntry.getValue());
		 }
		
		return listMap;
	}
}
