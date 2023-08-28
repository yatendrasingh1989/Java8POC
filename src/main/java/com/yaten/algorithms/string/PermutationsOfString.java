package com.yaten.algorithms.string;

public class PermutationsOfString {

    public void getPermutations(String str){
        if(str.length()!=4)
            return;

            for (int i = 0; i < str.length(); i++) {
               char selectedChar= str.charAt(i);
               StringBuilder sb= new StringBuilder(str);
               sb.deleteCharAt(i);
               String intermittent=selectedChar+swapCharacters(sb.toString());
               System.out.println(intermittent);
            }

    }

    private String swapCharacters(String str){
        char[] charStr= str.toCharArray();
        char ch;
        ch=charStr[1];
        charStr[1]=charStr[2];
        charStr[2]=ch;
        return String.valueOf(charStr);
    }


    public static void main(String[] str){
    String testStr="ABCD";
        PermutationsOfString obj= new PermutationsOfString();
        obj.getPermutations(testStr);
    }
}
