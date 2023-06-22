package com.yaten.java8.Arrays;

public class StepsToReduceToZero {


    public static void main(String[] args) {
        StepsToReduceToZero obj= new StepsToReduceToZero();

       int steps=obj.returnNumber(14,0);
       System.out.println(steps);
    }

    public int returnNumber(int number, int counter){
        if(number==0){
           return counter;
        }
        if(number % 2==0)
          return   returnNumber(number/2, counter+1);
        else
            return returnNumber(number-1, counter+1);
    }
}
