package com.javadev.fundamental;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacterOccurance1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		
		String input = scan.nextLine();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		char[] ch = input.toCharArray();
		
		for(Character chr : ch) {
			if(map.containsKey(chr)) {
				map.put(chr, map.get(chr) + 1);
			}else {
				map.put(chr, 1);
			}
		}
		System.out.println(map);
		
		Set<Character> set = map.keySet();
		for(Character chr : set) {
			if(map.get(chr) > 1) {
				System.out.println(chr + "==>"+map.get(chr));
			}
		}
		
	}

}
