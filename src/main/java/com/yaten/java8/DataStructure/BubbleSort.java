package com.yaten.java8.DataStructure;

import java.util.Arrays;

public class BubbleSort {
    //Check if i element is greater than i+1 element and swap them else move to next index.
    //this is inplace algo means no need of any other data structure.
    // Complexity is O(n^2)
    public static void main(String[] args) {
        int[] arr={5,2,4,-3,6,1,9};
        BubbleSort bs= new BubbleSort();
        arr=bs.bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public int[] bubbleSort(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(i==j)
                    continue;
               else if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }



        }
        return arr;
    }
}
