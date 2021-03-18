package com.javadev.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsTest {
	
	private static List<City> prepareTemperature() 
	{ 
	    List<City> cities = new ArrayList<>(); 
	    cities.add(new City("New Delhi", 33.5)); 
	    cities.add(new City("Mexico", 14)); 
	    cities.add(new City("New York", 13)); 
	    cities.add(new City("Dubai", 43)); 
	    cities.add(new City("London", 15)); 
	    cities.add(new City("Alaska", 1)); 
	    cities.add(new City("Kolkata", 30)); 
	    cities.add(new City("Sydney", 11)); 
	    cities.add(new City("Mexico", 14)); 
	    cities.add(new City("Dubai", 43)); 
	    return cities; 
	} 

	public static void main(String[] args) {
		
		List<String> cityName = prepareTemperature().stream().filter(p -> p.getTemperature() > 10)
			.map(m -> m.getName()).collect(Collectors.toList());
		
		System.out.println(cityName);
		System.out.println("************************");
		
		List<City> nameStartsWith = prepareTemperature().stream().filter(p -> p.getName().startsWith("M")).collect(Collectors.toList());
		System.out.println(nameStartsWith);
		System.out.println("************************");
		
		//List<String> names = prepareTemperature().stream().map(f ->f.getName()).collect(Collectors.toCollection(List::new));
		
		Map<String, Double> keys = prepareTemperature().stream().collect(Collectors.toMap(City::getName, City::getTemperature,
										(key, value) -> key));
		
		System.out.println(keys);
		
		System.out.println("**************************");
		// Collects the elements and counts the occurrences.
		Map<String, Integer> count = prepareTemperature().stream().collect(Collectors.groupingBy(City::getName,
							Collectors.collectingAndThen(Collectors.counting(), f -> f.intValue())));
		
		System.out.println(count);
		System.out.println("**************************");
		// Counting no of elements, counting() method
		Map<String, Long> counts = prepareTemperature().stream().collect(Collectors.groupingBy(City::getName, Collectors.counting()));
		System.out.println(counts);
		
	}
}
