package com.yaten.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionFiltering {
	public static void main(String args[]) {
		List<String> myList= new ArrayList<>();
		myList.add("Mango");
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Apple");
		myList.add("Mango");
		myList.add("Apple");
		
		//find the number of each fruit with the name.
		Map<String,Integer> countMap= new HashMap<String, Integer>();
		myList.stream().forEach((fruit)->{
			if(countMap.containsKey(fruit)) {
				countMap.put(fruit, countMap.get(fruit)+1);
			}else {
				countMap.put(fruit,1);
			}	
		});
		System.out.println(countMap);
		
		
		Predicate<String> startWith= new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.startsWith("A");
			}
			
			
		};
		
		//find the fruits starts with A
		List<String> startWithList=myList.stream().filter(startWith).collect(Collectors.toList());
		System.out.println(startWithList);
	}
}
