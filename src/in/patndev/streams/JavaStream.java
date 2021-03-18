package in.patndev.streams;

import java.io.IOException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream {
	
	public static void main(String[] args) throws IOException {
		
		//1. Integer Stream
		IntStream
			.range(1, 11)
			.forEach(System.out::print);
		System.out.println();
		
		//2. Integer Stream with skip
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach(x -> System.out.println(x));
		System.out.println();
		
		//3. Integer Stream with sum
		System.out.println(
		IntStream
			.range(1, 5)
			.sum());
		System.out.println();
		
		//4. Stream.of, sorted and findFirst
		Stream.of("Zevi", "Patnaik", "Prasad")
		       .sorted()
		       .findFirst()
		       .ifPresent(System.out::print);
		
	}

}
