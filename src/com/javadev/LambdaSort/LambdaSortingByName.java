package com.javadev.LambdaSort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaSortingByName {

	public static void main(String[] args) {
		
		List<Developer> listDev = getDeveloper();
		
		//listDev.sort((d1, d2) -> d1.getName().compareTo(d2.getName()));
		
		listDev.sort((s1, s2) -> s1.getSalary().compareTo(s2.getSalary()));
		
		// reversed
		Comparator<Developer> revDev = (s1, s2) -> s1.getSalary().compareTo(s2.getSalary());
		listDev.sort(revDev.reversed());
		//listDev.sort((s1, s2) -> s2.getSalary().compareTo(s1.getSalary()));
		
		listDev.forEach(System.out::println);

	}
	
	private static List<Developer> getDeveloper(){
		
		List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("Devi", new BigDecimal("70000"), 33));
        result.add(new Developer("Anusha", new BigDecimal("80000"), 20));
        result.add(new Developer("Basava", new BigDecimal("100000"), 10));
        result.add(new Developer("Shekhar", new BigDecimal("170000"), 55));
		return result;
	}

}
