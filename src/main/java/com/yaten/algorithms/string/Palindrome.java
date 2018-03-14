package com.yaten.algorithms.string;

import org.springframework.util.StringUtils;

public class Palindrome {

    public boolean isPalindrome(String str){
        if(StringUtils.isEmpty(str))
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
