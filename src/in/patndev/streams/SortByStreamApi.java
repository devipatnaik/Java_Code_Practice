package in.patndev.streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortByStreamApi {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Devi", 102);
		map.put("Raja", 101);
		map.put("Suzaa", 105);
		map.put("Shaan", 104);
		
		map.entrySet().stream().forEach(System.out::println);
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("************************");
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		// For Custom Object
		Map<Employee, Integer> emp = new HashMap<>();
		emp.put(new Employee(101, "Devi", 60000), 10002);
		emp.put(new Employee(103, "Anita", 20000), 10003);
		emp.put(new Employee(102, "Shaan", 13000), 10004);
		emp.put(new Employee(105, "Suza", 97000), 10005);
		
		emp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
				.forEach(System.out::println);
		
		emp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
					  
	}

}
