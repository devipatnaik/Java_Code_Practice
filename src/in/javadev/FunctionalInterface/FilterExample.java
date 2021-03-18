package in.javadev.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Devi", "Suza", "Raja", "Shaan");

		/** Traditional Style **/
		/*for (String name : nameList) {
			if (!name.equals("Shaan")) {
				System.out.println(name);
			}
		}*/
		/** Functional Style **/
		nameList.stream().filter(p -> !p.equals("Shaan")).forEach(System.out::println);
		
	}

}
