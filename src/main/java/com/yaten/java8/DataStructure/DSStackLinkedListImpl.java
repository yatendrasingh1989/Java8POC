package com.yaten.java8.DataStructure;

public class DSStackLinkedListImpl {

    DSLinkedList stack;
    int top;
    public DSStackLinkedListImpl(){
        stack=new DSLinkedList();
        top=0;
    }

    public void push(String data){
        stack.add(data);
        top++;
    }

    public void pop(){
        stack.deleteAtIndex(top--);
    }
}
