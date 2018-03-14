package com.yaten.algorithms.string;

public class Reverse {

    public static String reverseStringUsingIteration(String str){
        char[] chars=str.toCharArray();
        String reverseStr="";
        if(chars.length<=0)
        return null;
        for(int i=chars.length-1;i>=0;i--){
            reverseStr+=chars[i];
        }
        return reverseStr;
    }

    public static String reverseStringUsingStringBuffer(String str){
        String reverseStr= new StringBuffer(str).reverse().toString();
        return reverseStr;
    }
}
