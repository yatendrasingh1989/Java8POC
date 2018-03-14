package com.yaten.java8.DataStructure;

public class MainMethodStackLL {

    public static void main(String[] args){
    DSStackLinkedListImpl stackLinkedList= new DSStackLinkedListImpl();
        stackLinkedList.push("Yatendra");
        stackLinkedList.push("Harnu");
        stackLinkedList.push("Deepak");
        stackLinkedList.push("Krishna");

        //System.out.println(stackLinkedList.toString());

        stackLinkedList.pop();
       // System.out.println(stackLinkedList.toString());
        stackLinkedList.pop();
    }
}
