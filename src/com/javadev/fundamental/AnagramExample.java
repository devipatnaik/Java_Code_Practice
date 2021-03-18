package com.javadev.fundamental;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramExample {
	
	public static void main(String[] args) {
		
		String[] input = {"dog", "cat", "act", "abc", "god", "bbc","dev", "ved"};
		anagramPrint(input);
		
	}

	public static void anagramPrint(String[] input) {
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(int i=0; i < input.length; i++) {
			
			// convert to char array
			String word = input[i];
			char[] ch = word.toCharArray();
			
			Arrays.sort(ch);
			
			// now re-convert to String
			String newWord = new String(ch);
			
			// Calculate hashcode of string and sort
			if(map.containsKey(newWord)) {
				map.get(newWord).add(word);
				
			}
			else {
				List<String> list = new ArrayList<>();
				list.add(word);
				map.put(newWord, list);
			}
			
		}
		
		for(String str : map.keySet()) {
			List<String> value = map.get(str);
			if(value.size() >= 1) {
				System.out.println(value);
			}else {
				System.out.println(value);
			}
		}
	}
}
