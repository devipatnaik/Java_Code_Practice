package in.javadev.spliterators;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorSequentialIteration {

	public static void main(String[] args) {
		List<String> splitList = new ArrayList<>();
		splitList.add("Devi");
		splitList.add("Suza");
		splitList.add("Shaan");
		splitList.add("Raja");

		// Getting Spliterator
		Spliterator<String> listSpliterator = splitList.spliterator();
		
		// Traverse Elements
		listSpliterator.forEachRemaining(System.out::println);
	}

}
