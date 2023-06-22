package com.yaten.algorithms.string;

import java.util.Arrays;
import java.util.Objects;

public class StringSorting {

    public static String getSortedString(String str){
        if(null==str ||"".equals(str)){
            return "Please pass a valid String";
        }
        char[] chars=str.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static void main(String[] args){
    System.out.println(StringSorting.getSortedString("dcba"));
        System.out.println(StringSorting.getSortedString(""));
    }
}
