package com.yaten.algorithms.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharInStr {

    public static void main(String[] args) {
        String s= "Pizza";
        int index = -1;
        for(char ch : s.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println(ch);
            }
        }

    }
}
