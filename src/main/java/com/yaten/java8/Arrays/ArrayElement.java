package com.yaten.java8.Arrays;



import java.util.Arrays;

/**
 * Created by ysingh12 on 7/14/2017.
 */
public class ArrayElement {

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int num=5;
        boolean b = Arrays.stream(arr).anyMatch(i-> i == num);
        System.out.print(b);
    }
}
