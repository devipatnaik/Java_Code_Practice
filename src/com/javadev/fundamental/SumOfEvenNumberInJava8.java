package com.javadev.fundamental;

import java.util.stream.IntStream;

public class SumOfEvenNumberInJava8 {

	public static void main(String[] args) {
	
		int sumEven = IntStream.of(1,2,5,8,4,6,8)
				.filter(p -> p%2 == 0).sum(); // 2 + 4 + 6 + 8 + 8
		System.out.println("Sum of Even No is : "+sumEven);
	}

}
