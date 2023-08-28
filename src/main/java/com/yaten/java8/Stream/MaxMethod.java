package com.yaten.java8.Stream;

import java.util.ArrayList;
import java.util.List;

public class MaxMethod {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(0);
        ll.add(10);
        ll.add(20);
        ll.add(5);
        ll.add(15);
        ll.add(25);
        //Max method expect the comparator followed by get()
        Integer max= ll.stream().max((a,b)->a.compareTo(b)).get();
    }
}
