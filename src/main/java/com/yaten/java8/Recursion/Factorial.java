package com.yaten.java8.Recursion;

public class Factorial {
    public static void main(String[] args) {
    int num=6;
    System.out.println("Factorial of " + num +"is :"+Factorial.factorial(num));
    }

    public static int factorial(int num){
        if(num<=1)
            return num;
        return num * factorial(num-1);

    }
}
