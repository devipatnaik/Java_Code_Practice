package com.javadev.fundamental;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepetingCharacter {

	public static void main(String[] args) {

		String input = "java";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		char[] ch = input.toCharArray();

		for (Character chr : ch) {

			if (map.get(chr) == null) {
				map.put(chr, 1);
			} else {
				map.put(chr, map.get(chr) + 1);
			}

		}
		for (Character chr : ch) {
			if (map.get(chr) == 1) {
				System.out.println("Non : " + chr);
				break;
			}
		}

	}

}
