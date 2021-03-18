package com.javadev.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {
	
	public static void main(String[] args) {
		
		System.out.println(args.length);   // empty but not null
		
		Set s = new HashSet();
		s.add(null);
		s.add(1);
		s.add(null);
		s.add(null);
		
		System.out.println(s+" "+s.size());
		Map map = new HashMap();
		List l = new ArrayList();
		Hashtable h = new Hashtable();
		h.put(null,1);
		System.out.println(h.size());
		l.add(null);
		l.add(null);
		System.out.println(l.size());
		map.put(null, "Test");
		map.put(null, "Fest");
		map.put(null, "Cast");
		
		System.out.println(map.size());
	}

}
