package com.yaten.java8.Collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyMap {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "hello", "mighty");
		System.out.println(calculateFrequency(words));
	}
	
	public static Map<String,Long> calculateFrequency(List<String> words){

		Map<String,Long> frequency= words.stream().collect(Collectors.groupingBy(Function.identity(),HashMap::new,Collectors.counting()));

		return frequency;
	}

}
