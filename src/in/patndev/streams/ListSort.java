package in.patndev.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		
		// Primitive Type
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(4);
		list.add(26);
		list.add(11);
		
		// Custom Object
		List<Employee> employees = DataBase.getEmployees();
		
		// Traditional Style
		/* Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return (int) (e1.getSalary() - e2.getSalary());
			}
		}); */
		 
		
		// Functional Style
		//Collections.sort(employees, ( e1,  e2) ->  
		//			(int) (e1.getSalary() - e2.getSalary()));

		//System.out.println(employees);	
		
		// Stream API
		//employees.stream().sorted(( e1,  e2) -> (int) (e2.getSalary() - e1.getSalary())).forEach(System.out::println);
		
		//employees.stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
		
		employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		/*
		// Traditional Style
		Collections.sort(list); // ascending
		System.out.println(list);
		
		// Functional Style
		list.stream().sorted().forEach(System.out::println); // ascending
		System.out.println("******");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // descending
		*/
	}

}
