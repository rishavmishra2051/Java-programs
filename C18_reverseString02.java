package com.exchange;

public class C18_reverseString02 {
    static String reverseString02(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(C18_reverseString02.reverseString02("Rishav"));
    }
}
