package com.javadev.List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add("10");
		list.add("20");
		list.add("30");
		list.add(1);
		list.add(2);
		
		list.remove(1);
		list.remove(new Integer(1));
		list.remove(new Integer(2));
		
		System.out.println("Update : "+list);
		
		
	}

}
