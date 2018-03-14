package com.yaten.java8.DataStructure;

public class MainMethodStack {

    public static void main(String[] args){
        DSStackArrayImpl stackArray=new DSStackArrayImpl();
        stackArray.push("Yatendra");
        stackArray.push("Harnu");
        stackArray.push("Deepak");
        stackArray.push("Krishna");

        System.out.println(stackArray.toString());

        stackArray.pop();
        System.out.println(stackArray.toString());

    }
}
