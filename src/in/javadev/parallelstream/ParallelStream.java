package in.javadev.parallelstream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream {

	public static void main(String[] args) {
		
		List<String> list = 
		Stream.iterate("1", s -> s + "1")
		.parallel()
		.limit(1000)
		//.forEach(s -> list.add(s));  // not correct code
		.collect(Collectors.toList());
		
		System.out.println("Size "+list.size());
	}

}
