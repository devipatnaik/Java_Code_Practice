package in.javadev.stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortByKey {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Devi", 104);
		map.put("Raja", 187);
		map.put("Suza", 165);
		map.put("Amit", 121);
		
		Set<Entry<String, Integer>> set = map.entrySet();
		
		
		List<Entry<String, Integer>> list = new ArrayList<>(set);
		// Traditional Way
		/*Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				return e1.getKey().compareTo(e2.getKey());
			}
		});*/
		
		// Lambda
		Collections.sort(list, (e1,e2) -> e1.getKey().compareTo(e2.getKey()));
		
		
		for(Entry<String, Integer> entry : list) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}
		System.out.println("********");
		
		// Stream API
		//set.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
	}

}
