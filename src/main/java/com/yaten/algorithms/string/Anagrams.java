package com.yaten.algorithms.string;

import java.util.Arrays;

public class Anagrams {
    //string that contains the same characters, only the order of characters can be different.
    public boolean isAnagrams(String str1,String str2){
        char[] charFromWord = str1.toLowerCase().toCharArray();
        char[] charFromAnagram = str2.toLowerCase().toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);
    }


    public static void main(String[] args){
        Anagrams obj= new Anagrams();
        System.out.println(obj.isAnagrams("Army","Mary"));
    }
}
