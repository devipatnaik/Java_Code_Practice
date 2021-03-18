package in.javadev.parallelstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ForkJoinPoolTest {

	public static void main(String[] args) {
		
		ForkJoinPool corePool = ForkJoinPool.commonPool();
		
		System.out.println("CORES===> "+corePool.getParallelism());
		
		Stream<String> sequenceStream = Stream.of("Devi", "Shaan", "Suza", "Raj");
		System.out.println("*****Sequential******");
		sequenceStream.forEach(System.out::println);
		System.out.println("----------------------------");
		
		Stream<String> parallelStream = Stream.of("Devi", "Shaan", "Suza", "Raj");
		System.out.println("*****Parallel******");
		parallelStream.parallel().forEach(System.out::println);
		List<String> list = Arrays.asList("Devi", "Shaan", "Suza", "Raj");
		list.parallelStream().forEach(System.out::println);
		
		// 1 to 11 range
		IntStream sequenceIntStream = IntStream.range(1, 11);
		System.out.println("*****Sequential******");
		sequenceIntStream.forEach(System.out::println);
		System.out.println("----------------------------");
		System.out.println("*****Parallel******");
		IntStream parallelIntStream = IntStream.range(1, 11);
		parallelIntStream.parallel().forEach(System.out::println);
		
		// to print a -z 97-122
		System.out.println(getAlphabeats());
		System.out.println("*****Sequential******");
		Stream<String> alphabeatSequence = getAlphabeats().stream();
		alphabeatSequence.forEach(System.out::println);
		System.out.println("------------------");
		System.out.println("*****Parallel******");
		Stream<String> alphabeatParallel = getAlphabeats().parallelStream();
		alphabeatParallel.forEach(System.out::println);
		
		// check stream is running in parallel mode: isParallel() method
		IntStream parallelrange = IntStream.rangeClosed(1, 11);
		System.out.println(parallelrange.isParallel()); // false
		System.out.println("---------------");
		parallelrange.parallel().forEach(System.out::println);
		System.out.println(parallelrange.isParallel());  // true
	}
	
	public static List<String> getAlphabeats() {
		List<String> alpha = new ArrayList<>();
		int n = 97;
		while(n <= 122) {
			char ch = (char) n;
			alpha.add(String.valueOf(ch));
			n++;
		}
		return alpha;
	}

}
