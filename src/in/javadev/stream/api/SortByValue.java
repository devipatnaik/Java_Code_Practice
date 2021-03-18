package in.javadev.stream.api;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortByValue {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Devi", 104);
		map.put("Raja", 187);
		map.put("Suza", 165);
		map.put("Amit", 121);
		
		Set<Entry<String, Integer>> set = map.entrySet();
		
		List<Entry<String, Integer>> list = new LinkedList<>(set);
		
		Collections.sort(list, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));

		for(Entry<String, Integer> entry : list) {
			System.out.println("Key :"+entry.getKey() + " Value :" + entry.getValue());
		}
	}
}
