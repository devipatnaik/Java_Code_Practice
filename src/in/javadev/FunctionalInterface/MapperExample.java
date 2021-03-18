package in.javadev.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class MapperExample {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Devi", "Suza", "Raja", "Shaan");
		
		/** Imperative Style **/
		for (String name : nameList) {
			if (!name.equals("Shaan")) {
				User user = new User(name);
				System.out.println(user);
			}
		}
		System.out.println("***********");
		/** Functional Style **/
		nameList.stream()
				.filter(p->!p.equals("Raja"))
				.map(User::new)
				.forEach(System.out::println);
	}
}
