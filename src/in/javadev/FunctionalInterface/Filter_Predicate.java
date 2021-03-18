package in.javadev.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class Filter_Predicate {

	public static void main(String[] args) {
		
		/** Traditional Style **/
		List<Integer> list = Arrays.asList(3,4,21,20,12);
		
		/*for(int i=0; i<list.size(); i++) {
			int num = list.get(i);
			if(num % 5 == 0) {
				System.out.println(list.get(i));
			}
		}*/
		/** Functional Style **/
		list.parallelStream().filter(p -> p % 5 == 0).forEach(System.out::println);
	}
}
