package in.javadev.advancestream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapListExample {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3);
		List<Integer> list2 = Arrays.asList(4, 5, 6);
		List<Integer> list3 = Arrays.asList(7, 8, 9);
		
		List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);

		List<Integer> listOfIntegers = 
				listOfLists.stream()
				.flatMap(f -> f.stream())
				.collect(Collectors.toList());
		
		System.out.println(listOfIntegers);
		
	}

}
