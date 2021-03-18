package com.javadev.List;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplictaeFromListUsingSet {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("E");
		list.add("I");
		list.add("O");
		list.add("I");
		list.add("U");

		System.out.println("List Duplicates : " + list);

		Set<String> set = new LinkedHashSet<>(list);
		// clear the List 
		list.clear();
		
		// add the set to the list
		list.addAll(set);
		System.out.println("Duplicates Removed : "+list);

	}

}
