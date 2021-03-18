package in.patndev.streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinNumberFromArray {

	public static void main(String[] args) {
		
		int[] num = {4,6,77,7,8,9};
		
		int min = num[0];
		
		for(int i=1; i<num.length; i++) {
			if(num[i] < min) {
				min = num[i];
			}
		}
		System.out.println("Min Number is : "+ min);
		
		System.out.println("**************");
		OptionalInt minVal = IntStream.of(num).min();
		OptionalInt maxVal = IntStream.of(num).max();
		long count = IntStream.of(num).count();
		System.out.println("Count..."+count);
		OptionalDouble avg = IntStream.of(num).average();
		System.out.println("AVG...."+avg);
		int sum = IntStream.of(num).sum();
		System.out.println("SUM...."+sum);
		//int minVal2 = IntStream.of(num).min().getAsInt();
		//IntStream.of(num).min().ifPresent(System.out::println);
		System.out.println("MIN Value is : "+ minVal);
		System.out.println("MAXX Value is : "+ maxVal);
		System.out.println("*****************");
		IntSummaryStatistics summry = IntStream.of(num).summaryStatistics();
		System.out.println("SUMMERY......" + summry);
		
	}
}
