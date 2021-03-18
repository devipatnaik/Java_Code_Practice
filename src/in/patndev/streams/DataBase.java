package in.patndev.streams;

import java.util.ArrayList;
import java.util.List;

// DAO Layer
public class DataBase {

	public static List<Employee> getEmployees() {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Devi", 20000));
		list.add(new Employee(111, "Raja", 30000));
		list.add(new Employee(121, "Suza", 10000));
		list.add(new Employee(131, "Shaan", 40000));
		return list;
	}
}
