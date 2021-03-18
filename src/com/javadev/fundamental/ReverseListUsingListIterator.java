package com.javadev.fundamental;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseListUsingListIterator {

	public static void main(String[] args) {
		
		List<Integer> listNum = new ArrayList<Integer>();
		for(int i=0; i<=10; i++) {
			listNum.add(i);
		}
		
		ListIterator<Integer> listItr = listNum.listIterator();
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		List<Integer> listRevNum = new ArrayList<>();
		ListIterator<Integer> listItrNum = listNum.listIterator(listNum.size());
		
		while(listItrNum.hasPrevious()) {
			listRevNum.add(listItrNum.previous());
		}
		System.out.println(listRevNum);
	}

}
