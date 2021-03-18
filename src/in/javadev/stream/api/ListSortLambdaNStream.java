package in.javadev.stream.api;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListSortLambdaNStream {

	public static void main(String[] args) {
		
		List<Employee> listEmp = DataDAO.getEmployees();
		
		/** Functional Style **/
		// Lambda
		Collections.sort(listEmp, (e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
		
		/*for (int i = 0; i < listEmp.size(); i++) {
			Employee movie = (Employee) listEmp.get(i);
		      System.out.println(movie);
		 
		}*/
		
		System.out.println(listEmp);
		
		// Stream API
		// listEmp.stream().sorted((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).forEach(System.out::println);
		
		// listEmp.stream().sorted(Comparator.comparing(e1 -> e1.getSalary())).forEach(System.out::println);
		
		listEmp.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
		List<Employee> sal = listEmp.stream().filter(s -> s.getSalary() > 20000).collect(Collectors.toList());
		System.out.println(sal);
		
		// max salary
		Optional<Employee> maxSal = listEmp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(maxSal);
		Optional<Employee> salMax = listEmp.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println(salMax);
		
		System.out.println("**************************");
		List<Employee> empSal = listEmp.stream().filter(p -> p.getSalary() > 25000 ).collect(Collectors.toList());
		System.out.println("Salary =====" + empSal);
	}
}
