package com.yaten.java8.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomSortingCollections {
    public static void main(String[] args) {
        List<String> myList= new ArrayList<>();
        myList.add("Mango");
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Apple");
        myList.add("Mango");
        myList.add("Apple");
        System.out.println("Before Sorting: "+myList);
        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };


        Comparator<String> comparatorReverse=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };


        //Option-1
       // Collections.sort(myList,comparator);

        //Option-2
        //myList.sort(comparator);

        //Option-3 (Natural Sorting)
        //List<String> mySortedList=myList.stream().sorted().collect(Collectors.toList());

        //Option-4 (Reverse)
        List<String> mySortedList=myList.stream().sorted(comparatorReverse).collect(Collectors.toList());
        System.out.println("After Sorting: "+mySortedList);



    }
}
