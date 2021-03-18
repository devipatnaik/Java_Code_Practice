package in.javadev.parallelstream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

	public static void main(String[] args) {
		
		boolean prime = isPrime(24);
		System.out.println(prime);
		
		long t1, t2;
		t1 = System.currentTimeMillis();
		long count = Stream.iterate(0, n -> n+1)
		.limit(500000)
		//.parallel()
		.filter(PrimeNumberWithParallelStream::isPrime)
		.peek(p -> System.out.println(p))
		.count();
		
		System.out.println("Total Prime No. "+count);
		t2 = System.currentTimeMillis();
		
		System.out.println("Total Time taken : "+ (t2-t1)/1000);
		
		// in parallel
		//Total Prime No. 41538
		//Total Time taken : 16
		
		// in sequential
		//Total Prime No. 41538
		//Total Time taken : 27
		
	}
	
	public static boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		
		return !IntStream.rangeClosed(2, number/2).anyMatch(p -> number%p == 0);
		
	}

}
