package com.javadev.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamSortByAge {

	public static void main(String[] args) {
		
		List<User> user = Arrays.asList(
			new User("E",30),
			new User("D",40),
			new User("A",10),
			new User("B",20),
			new User("C",50));
		// Sort by Age
		List<User> sortedList = user.stream()
				//.sorted((o1,o2) -> o1.getAge() - o2.getAge())
				.sorted(Comparator.comparingInt(User::getAge))
				.collect(Collectors.toList());
				
		sortedList.forEach(System.out::println);
		
		System.out.println("=================");
		List<User> listRev = user.stream()
				.sorted(Comparator.comparingInt(User::getAge)
				.reversed())
				.collect(Collectors.toList());
		
		listRev.forEach(System.out::println);
				
	}

}
