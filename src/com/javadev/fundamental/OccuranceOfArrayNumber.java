package com.javadev.fundamental;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceOfArrayNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,3,3,3,4,5,8,8,8,8,7,8,2,9};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(Integer no : arr) {
			//System.out.print(no+" ");
			
			if(map.get(no) == null) {
				
				map.put(no, 1);
			}else {
				map.put(no, map.get(no) + 1);
			}
			
		}
		//System.out.println(map);
		
		Set<Integer> set = map.keySet();
		for(Integer no : set) {
		if(map.get(no) > 1) {
				System.out.println("No: "+no+" ==> "+map.get(no)+" times");
			}
		}
		
	}

}
