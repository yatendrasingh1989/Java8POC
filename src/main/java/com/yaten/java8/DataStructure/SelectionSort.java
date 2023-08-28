package com.yaten.java8.DataStructure;

import java.util.Arrays;

public class SelectionSort {

    //Find the smallest element in the array put it in 0index then next smallest and put it at 1index.
    //O(n^2)
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, -3, 6, 1, 9};
    SelectionSort ss= new SelectionSort();
    arr=ss.selectionSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public int[] selectionSort(int[] arr){
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[index]>arr[j]) {
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }

        return arr;
    }
}
