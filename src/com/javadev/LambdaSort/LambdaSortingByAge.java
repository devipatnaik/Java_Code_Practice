package com.javadev.LambdaSort;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LambdaSortingByAge {
	
	public static void main(String[] args) {
		
		List<Developer> listDev = getDeveloper();
		
		listDev.sort((d1, d2) -> d1.getAge() - d2.getAge());
		
		listDev.forEach(System.out::println);
		
	}
	
	private static List<Developer> getDeveloper() {
		
		List<Developer> result = new ArrayList<>();
		result.add(new Developer("Devi", new BigDecimal("70000"), 33));
        result.add(new Developer("Anusha", new BigDecimal("80000"), 20));
        result.add(new Developer("Basava", new BigDecimal("100000"), 10));
        result.add(new Developer("Shekhar", new BigDecimal("170000"), 55));
		return result;
		
	}

}
