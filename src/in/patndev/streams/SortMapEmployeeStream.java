package in.patndev.streams;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMapEmployeeStream {
	
	public static void main(String[] args) {
		
		Map<Employee, Integer> map = new TreeMap<>((o1,o2) -> o1.getSalary() - o2.getSalary());
		
		map.put(new Employee(101, "Raja", 50000), 200);
		map.put(new Employee(104, "Shaan", 40000), 202);
		map.put(new Employee(107, "Devi", 20000), 204);
		map.put(new Employee(102, "Suza", 30000), 206);
		
		System.out.println(map);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
							   .forEach(System.out::println);;
		System.out.println("***********************");
		
	}

}
