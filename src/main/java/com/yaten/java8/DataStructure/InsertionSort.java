package com.yaten.java8.DataStructure;

import java.util.Arrays;

public class InsertionSort {

        public static void main(String[] args) {
            int[] arr = {5, 2, 4, -3, 6, 1, 9};
        InsertionSort is= new InsertionSort();
        arr=is.insertionSort(arr);
            Arrays.stream(arr).forEach(System.out::println);
    }

    public int[] insertionSort(int[] arr){
            for(int i=1;i<arr.length;i++){
                int unsortedElement=arr[i];
                int j;
                for(j=i;j>0&&(arr[j]<arr[j-1]);j--){
                    arr[j]=arr[j-1];
                }
                arr[j]=unsortedElement;
            }

            return arr;
    }
}
