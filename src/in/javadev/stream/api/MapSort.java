package in.javadev.stream.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSort {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Devi", 109);
		map.put("Raja", 102);
		map.put("Shaan", 101);
		map.put("Suza", 111);
		
		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		/** Traditional Style **/
		/*Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		});
		
		for(Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + "===" + entry.getValue());
		}*/
		
		/** Functional Style **/
		/*Collections.sort(list, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));
		
		for(Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + "===" + entry.getValue());
		}*/
		
		/** Stream API **/
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//System.out.println("****************");
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		/** If the Map Having Custom Object, Then How to do this? **/
	}
}
