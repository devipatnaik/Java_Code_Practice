package com.javadev.fundamental;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacterOccurance {

	public static void main(String[] arg){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String input = scan.nextLine();
		//String input = "abacbba";
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		char[] ch = input.toCharArray();
		
		for(Character chr : ch) {
			
			if(map.get(chr) == null) {
				map.put(chr, 1);
			}else {
				map.put(chr, map.get(chr) + 1);
			}
			
		}
		System.out.println(map);
		// in this logic only print the duplicate occurrence
		
		/*Set<Character> set = map.keySet();
		
		for(Character chr : set) {
			if(map.get(chr) > 1) {
				System.out.println(chr +"==>"+map.get(chr));
			}
		}*/
	}
}