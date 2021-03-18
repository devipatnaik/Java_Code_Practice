package in.javadev.advancestream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCharacterUsingFlatMap {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("JavaDev", "Java");
		
		// output : J a v D e
		
		List<String> rmDup = words.stream().map(f -> f.split(""))
					  .flatMap(Arrays::stream)
					  .distinct()
					  .collect(Collectors.toList());
		
		System.out.println(rmDup);
	}

}
