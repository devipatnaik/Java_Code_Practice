package in.patndev.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortStream {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Devi", 3);
		map.put("Suza", 5);
		map.put("Amit", 7);
		
		// Sort By Key and Value in Java 7
		List<Entry<String,Integer>> listEntry = new ArrayList<>(map.entrySet());
		Collections.sort(listEntry, new Comparator<Entry<String, Integer>>(){

			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				//return o1.getKey().compareTo(o2.getKey());
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for(Entry<String, Integer> entry : listEntry) {
			System.out.println(entry.getKey() + "===" + entry.getValue());
		}
		
		System.out.println("************************************");
		
		// Sort By Key n Value in Java 8 (Lambda)
		/*
		 * List<Entry<String, Integer>> listEntry8 = new ArrayList<>(map.entrySet());
		 * Collections.sort(listEntry8, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		 * 
		 * for(Entry<String, Integer> entry : listEntry8) {
		 * System.out.println(entry.getKey() + "==="+entry.getValue()); }
		 * 
		 * System.out.println("*************************************");
		 */
		
		// Sort By Key n Value in Java 8 (Stream API)
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out :: println);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out :: println);
		
	}
}
