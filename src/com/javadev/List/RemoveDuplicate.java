package com.javadev.List;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("E");
		list.add("I");
		list.add("O");
		list.add("I");
		list.add("U");

		System.out.println("Original List : "+list);
		
		List<String> rmList = new ArrayList<>();
		
		for(String rm : list) {
			if(!rmList.contains(rm)) {
				rmList.add(rm);
			}
		}
		
		for(String s : rmList) {
			System.out.println("Duplicate Romoved : " + s);
		}

	}

}
