package in.patndev.streams;

import java.util.HashMap;
import java.util.Map;

public class StreamMapPrint {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Devi", 102);
		map.put("Raja", 101);
		map.put("Suzaa", 105);
		map.put("Shaan", 104);
		
		map.forEach((k, v)-> System.out.println(k+": "+v));  // normal print map
		System.out.println("----------------");
		map.entrySet().stream().forEach(System.out::println); // print map in stream api
		System.out.println("-----------------");
		map.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + "====" + entry.getValue());
			
		});
	}

}
