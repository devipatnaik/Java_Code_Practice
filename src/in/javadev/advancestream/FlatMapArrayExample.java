package in.javadev.advancestream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapArrayExample {

	public static void main(String[] args) {
		
		String[][] data = new String[][] {{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
		
		List<String> listOfChars = Arrays.stream(data)
										 .flatMap(f -> Arrays.stream(f))
										 .collect(Collectors.toList());
		
		System.out.println(listOfChars);
		
	}

}
