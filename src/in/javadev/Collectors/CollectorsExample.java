package in.javadev.Collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {

	public static void main(String[] args) {
		
		List<String> people = new ArrayList<String>();
		people.add("Devi");
		people.add("Raja");
		people.add("Shaan");
		people.add("Suza");
		
		List<Integer> listInt = Arrays.asList(1,3,6,3,7,8);
		
		List<String> collect = people.stream().filter(p -> p.startsWith("S"))
					   .collect(Collectors.toList());
		
		System.out.println(collect);
		
		// Count
		long count = listInt.stream().collect(Collectors.counting());
		System.out.println(count);
		
		// AverageingInt
		double avg = listInt.stream().collect(Collectors.averagingInt(a -> a));
		System.out.println(avg);
		
		double avg1 = listInt.stream().collect(Collectors.averagingInt(a -> a*a));
		System.out.println(avg1);
		
		// Joining
		
		
	}

}
