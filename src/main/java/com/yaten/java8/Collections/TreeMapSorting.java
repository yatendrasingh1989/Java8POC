package com.yaten.java8.Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSorting {

	public static void main(String[] args) {
		
		//Natural Sorting map.
		Map<Integer, String> map= new TreeMap<Integer, String>();
		map.put(1, "Yaten");
		map.put(2, "Harnu");
		map.put(3, "Nitya");
		map.put(4, "Charvi");
		map.put(5, "Kush");
		map.put(6, "TBD");
		
		System.out.println(map);
		
		//Descending Sorting map.
		Map<Integer, String> map1= new TreeMap<Integer, String>((a,b)->((a>b)?-1:(a<b)?1:0) );
		map1.put(1, "Yaten");
		map1.put(2, "Harnu");
		map1.put(3, "Nitya");
		map1.put(4, "Charvi");
		map1.put(5, "Kush");
		map1.put(6, "TBD");
		System.out.println(map1);
	}

}
