package com.javadev.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapDataBase {
	
	public static List<Customer> getAllData() {
		return Stream.of(
				new Customer(101,"Devi","devipatnaik@gmail.com",Arrays.asList("9148749525","7892230816")),
				new Customer(103,"Suza","sujatadas@gmail.com",Arrays.asList("9937379074","9937379076")),
				new Customer(102,"Shaan","shreyanshpatnaik2020@gmail.com",Arrays.asList("9178420450","8277754165"))
		).collect(Collectors.toList());
	}
}
