package com.yaten.java8.DataStructure;

public class MainMethodDLL {

    public static void main(String[] args) {
        DSDoublyLinkedList linkedList = new DSDoublyLinkedList();
    linkedList.add("Yatendra");
    linkedList.add("Harneet");
    linkedList.add("Deepak");
    linkedList.add("Charu");
    linkedList.add("Papa");
    linkedList.add("Maa");
    linkedList.add("Kush");


        linkedList.insertAtIndex(7,"Mother In Law" );
        linkedList.printList();

       // linkedList.printReverse();
    }
}
