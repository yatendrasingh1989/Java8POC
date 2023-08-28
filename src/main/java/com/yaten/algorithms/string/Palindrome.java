package com.yaten.algorithms.string;

public class Palindrome {
    //the reverse of the string is the same as the original one
    public boolean isPalindrome(String str){
        if(null==str || str.isEmpty())
        return false;
        String revrsedStr=Reverse.reverseStringUsingStringBuffer(str);
        return str.equals(revrsedStr);
    }
    public static void main(String[] args){
        Palindrome obj= new Palindrome();
        System.out.println(obj.isPalindrome("Army"));
        System.out.println(obj.isPalindrome("radar"));

        System.out.println(obj.isPalindrome(""));
    }
}
