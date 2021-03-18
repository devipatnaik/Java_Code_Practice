package com.javadev.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortByName {

	public static void main(String[] args) {
		
		List<User> user = Arrays.asList(
				new User("E",30),
				new User("D",40),
				new User("A",10),
				new User("B",20),
				new User("C",50));
		
		List<User> sortList = user.stream()
				.sorted(Comparator.comparing(User::getName))
				.collect(Collectors.toList());
		sortList.forEach(System.out::println);

	}

}
