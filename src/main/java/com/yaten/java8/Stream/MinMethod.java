package com.yaten.java8.Stream;

import java.util.ArrayList;
import java.util.List;

public class MinMethod {
    public static void main(String[] args) {
        List<Integer> ll= new ArrayList<>();
        ll.add(0);
        ll.add(10);
        ll.add(20);
        ll.add(5);
        ll.add(15);
        ll.add(25);
        //Min method expect the comparator and get() should be called to get the output.
        Integer in= ll.stream().min((a,b)->a.compareTo(b)).get();

        System.out.println(in);
    }
}
