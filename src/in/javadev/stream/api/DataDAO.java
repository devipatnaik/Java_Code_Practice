package in.javadev.stream.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// DAO Layer
public class DataDAO {

	public static List<Employee> getEmployees() {
		List<Employee> empDAO = new ArrayList<Employee>();
		empDAO.add(new Employee(101, "Raja", 25000));
		empDAO.add(new Employee(111, "Devi", 60000));
		empDAO.add(new Employee(106, "Suza", 21000));
		empDAO.add(new Employee(103, "Shaan", 10000));
		return empDAO;
	}
	
	public static Map<Employee, String> getMapEmployees(){
		
		Map<Employee, String> mapDAO = new HashMap<>();
		mapDAO.put(new Employee(101, "Raja", 25000), "MAP");
		mapDAO.put(new Employee(111, "Devi", 60000), "MAP");
		mapDAO.put(new Employee(106, "Suza", 21000), "MAP");
		mapDAO.put(new Employee(103, "Shaan", 10000), "MAP");
		return mapDAO;
	}
}
