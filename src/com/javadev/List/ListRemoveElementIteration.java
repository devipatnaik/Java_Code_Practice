package com.javadev.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRemoveElementIteration {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("E");
		list.add("I");
		list.add("O");
		list.add("I");
		list.add("U");
		
		System.out.println(list);
		//list.forEach(System.out::println);
		
		int flag = 5;
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext()) {
			flag ++;
			
			if(flag == 5) {
				list.remove(flag);
			}else {
				System.out.println(itr.next());
			}
		}
	}
}
