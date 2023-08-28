package com.yaten.java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer> ll= new ArrayList<>();
        ll.add(0);
        ll.add(10);
        ll.add(20);
        ll.add(5);
        ll.add(15);
        ll.add(25);
        System.out.println("Original List -"+ll.toString());
    //Make the elements in the list 2 times of the original value
        List<Integer> doubledList=ll.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("Double Element List -"+doubledList);
    //Map is way to perform some operation on each element of a collection.



        List<String> names= Arrays.asList("amit","deepak","sunny","sumit","hunny");
        List<String> namesInUpperCase= names.stream().map(str-> str.toUpperCase()).collect(Collectors.toList());
        System.out.println("Names in upper case -"+namesInUpperCase);
    }
}
