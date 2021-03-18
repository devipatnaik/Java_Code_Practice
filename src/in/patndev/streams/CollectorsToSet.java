package in.patndev.streams;

import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectorsToSet {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(5);
		set.add(7);
		
		Set<Integer> toSet = set.stream().collect(toSet());
		System.out.println(toSet);
		
		Set<Integer> toSet1 = set.stream().filter(p -> p > 2).collect(toSet());
		System.out.println(toSet1);
		
		Map<Integer, Integer> map = set.stream().collect(toMap(x -> x, y -> y*100));
		System.out.println(map);
		
	}

}
