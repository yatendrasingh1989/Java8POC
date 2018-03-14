package com.yaten.java8.DataStructure;

import java.util.Arrays;
import java.util.stream.Stream;

public class DSStackArrayImpl {
    String[] stack;
    int top;

    public DSStackArrayImpl(){
        stack= new String[16];
        top=0;
    }
    public DSStackArrayImpl(int size){
        stack= new String[size];
        top=0;
    }
    public void push(String data){
        stack[top]=data;
        top++;
        System.out.println("Data Pushed:" +data);
    }

    public String pop(){
      String data= stack[--top];
        System.out.println("Data Poped:" +data);
        /*if(0!=top)
            top--;*/
        return data;
    }

    @Override
    public String toString() {
        String data="";
        for(int i=0;i<top;i++){
            data+=stack[i]+" ";
        }

        return "DSStackArrayImpl{" +
                "stack= "+data+"}";
    }
}
