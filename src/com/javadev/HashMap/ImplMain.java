package com.javadev.HashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ImplMain {
	
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(104, "Devi", "SSE");
		Employee emp2 = new Employee(109, "Raja", "TL");
		Employee emp3 = new Employee(102, "Suza", "MGR");
		Employee emp4 = new Employee(103, "Amit", "SMGR");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
	
		// By ID
		class SortById implements Comparator{
			
			//Comparator<Employee> compareById = Comparator.comparingInt( Employee::getEmpId );

			@Override
			public int compare(Object e1, Object e2) {
				return ((Employee) e1).getEmpId() > ((Employee) e2).getEmpId() ? 1 : -1 ;
			}
		}
		
	//	Comparator<Employee> compareById = Comparator.comparingInt( Employee::getEmpId );
		
		Collections.sort(list,new SortById());
		System.out.println(list);
		
		System.out.println("************************");
		
		
		// By Name
		class SortByName implements Comparator{

			@Override
			public int compare(Object e1, Object e2) {
				return ((Employee) e1).getName().compareTo(((Employee) e2).getName());
			}
			
		}
		
		
		
		Collections.sort(list,new SortByName());
		System.out.println(list);
		System.out.println("************************");
		
		// By Desg
		class SortByDesignation implements Comparator{

			@Override
			public int compare(Object e1, Object e2) {
				// TODO Auto-generated method stub
				return ((Employee) e1).getDesignation().compareTo(((Employee) e2).getDesignation());
			}
			
		}
		
		Collections.sort(list,new SortByDesignation());
		System.out.println(list);
		
		
		
		
		Comparator<Employee> compareById = Comparator.comparing( Employee::getEmpId );
		//last name comparator
		Comparator<Employee> compareByName = Comparator.comparing( Employee::getName );
		Comparator<Employee> compareByDesign = Comparator.comparing( Employee::getDesignation );
		//Comparator<Employee> compareByName = Comparator.comparing( Employee::getName );
		
		//Compare by first name and then last name (multiple fields)
		Comparator<Employee> compareByAllFields = compareById.thenComparing(compareByName).thenComparing(compareByDesign);
		Comparator<Employee> compareByAllFields1 = compareByName.thenComparing(compareByDesign);
		//Use Comparator
		Collections.sort(list, compareById); 
		
		System.out.println("sorted using java 8 :- "+list);
		
	}

}
