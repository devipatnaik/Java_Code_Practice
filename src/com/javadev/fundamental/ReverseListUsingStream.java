package com.javadev.fundamental;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseListUsingStream {

	public static void main(String[] args) {
		
		List<Integer> listNum = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			listNum.add(i);

		}
		System.out.println(listNum);
		
		listNum.stream()											
		.collect(Collectors.toCollection(LinkedList::new)) 
		.descendingIterator()								
		.forEachRemaining(System.out::print); 
		
	}

}
