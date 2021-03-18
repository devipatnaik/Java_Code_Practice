package com.javadev.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StramSortNatural {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
		// Natural Sort
		List<String> sortList = list.stream()
				.sorted((o1,o2) -> o1.compareTo(o2))
				//.sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		
		sortList.forEach(System.out::println);
		System.out.println("-------");
		List<String> sortLists = list.stream().sorted().collect(Collectors.toList());
		sortLists.forEach(System.out::println);
		System.out.println("-------");
		// reverse order
		List<String> listRev = list.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		listRev.forEach(System.out::println);
	}

}
