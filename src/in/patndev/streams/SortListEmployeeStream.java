package in.patndev.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortListEmployeeStream {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(7);
		list.add(3);
		
		//list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);;

		List<Employee> empObj = DataBase.getEmployees();
		empObj.stream().sorted((o1,o2)-> o1.getSalary() - o2.getSalary()).forEach(System.out::println);
		System.out.println("******************************************");
		empObj.stream().sorted(Comparator.comparing(Employee::getName)).forEach(s->System.out.println(s));
		
		
	}

}
