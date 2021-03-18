package in.patndev.streams;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Devi", "Raja", "Shaan", "Suza");
		
		// Traditional Style
		for (String name : list) {
			if (!name.equals("Raja")) {
				System.out.println(name);
			}
		}
		
		// Functional Style
		System.out.println("Functional Style");
		
		list.stream()
		.filter(p -> !p.equals("Raja"))
		.forEach(System.out::println);
	}
}
