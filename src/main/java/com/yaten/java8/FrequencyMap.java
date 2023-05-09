package com.yaten.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyMap {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "hello", "mighty");
		System.out.println(calculateFrequency(words));
	}
	
	public static Map<String,Long> calculateFrequency(List<String> words){
		
		Map<String, Long> frequencyMap=words.stream().collect(Collectors.groupingBy(Function.identity(),HashMap ::new, Collectors.counting()));
		return frequencyMap;
		
	}

}
