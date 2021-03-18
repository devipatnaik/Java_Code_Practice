package com.javadev.fundamental;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseList {

	public static void main(String[] args) {

		List<Integer> listNum = new ArrayList<Integer>();

		for (int i = 1; i <= 10; i++) {
			listNum.add(i);

		}
		System.out.println(listNum);

		List<Integer> listRev = new ArrayList<>();

		for (int j = listNum.size(); j >= 1; j--) {
			listRev.add(j);
		}
		System.out.println("Reverse: " + listRev);
		
		
		
		// Using ListIterator
		
		/*ListIterator<Integer> listItr = listNum.listIterator();
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}

		List<Integer> listNum1 = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			listNum.add(i);
		}
		List<Integer> listRevNum = new ArrayList<Integer>();
		ListIterator<Integer> listIterator = listNum.listIterator(listNum.size());

		while (listIterator.hasPrevious()) {
			listRevNum.add(listIterator.previous());
		}

		System.out.println(listRevNum);*/

	}
}