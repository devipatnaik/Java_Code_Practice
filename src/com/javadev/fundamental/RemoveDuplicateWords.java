package com.javadev.fundamental;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Input: Good day day bye bye 
//output: Good day bye


public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
		
		String input = "Good day day bye bye";
		
		String[] str = input.split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String s : str) {
			
			if(map.get(s) == null) {
				map.put(s, 1);
			}
			else {
				map.put(s, map.get(s) + 1);
			}
		}
		//System.out.println(map);
		
		Set<Entry<String,Integer>> set = map.entrySet();
		for(Entry<String,Integer> entry : set) {
			if(entry.getValue() >= 1) {
				System.out.println(entry.getKey());
			}
		}
		
	}

}
