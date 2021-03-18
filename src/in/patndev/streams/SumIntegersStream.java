package in.patndev.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumIntegersStream {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,5,22,32,64,8);
		
		// Sum of all the integers grater than 10
		Integer result = list.stream().filter(p -> p>10).mapToInt(i -> i).sum();
		List<Integer> collect = list.stream().filter(p->p>10).collect(Collectors.toList());
		System.out.println("Result " + result);
		System.out.println("Result1 " + collect);
		
		// Sum of all the integers grater than 10 and square it
		list.stream().filter(p->p>10).forEach(p->System.out.println(p));
		
		list.stream().filter(p->p>10).map(f->f*f).forEach(p-> System.out.println(p));
		
		int sum = list.stream().filter(p->p>10).mapToInt(f->f).sum();
		System.out.println("SUM " +sum);
		
		
		List<String> listStr = new ArrayList<>();
		listStr.add("Devi");
		listStr.add("Shreyansh");
		listStr.add("Banglore");
		listStr.add("Patnaik");
		
		listStr.stream().filter(p->p.length() > 5).map(f->f.toUpperCase()).forEach(p->System.out.println(p));

	}

}
