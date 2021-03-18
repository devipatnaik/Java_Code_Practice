package in.javadev.stream.api;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapSortCustomLambdaNStream {

	public static void main(String[] args) {

		// Map<Employee, String> employeeDaoMap = DataDAO.getMapEmployees();

		/** Traditional Style **/
		/* Map<Employee, String> employeeMap = new TreeMap<>(new Comparator<Employee>() {

			public int compare(Employee e1, Employee e2) {
				return (int) (e1.getSalary() - e2.getSalary());
			}
		}); */
		 

		/** Functional Style **/
		Map<Employee, String> employeeMap = new TreeMap<>((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));

		employeeMap.put(new Employee(101, "Raja", 25000), "MAP");
		employeeMap.put(new Employee(111, "Devi", 60000), "MAP");
		employeeMap.put(new Employee(106, "Suza", 21000), "MAP");
		employeeMap.put(new Employee(103, "Shaan", 10000), "MAP");

		System.out.println(employeeMap);

		/** Stream API Comparing by Key **/

		employeeMap.entrySet().stream()
		.sorted(Map.Entry
		.comparingByKey(Comparator.comparing(Employee::getId)))
		.forEach(System.out::println);
	}
}














