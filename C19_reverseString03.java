package com.exchange;

public class C19_reverseString03 {
    static String str;
    static String rev;
    static char ch[];
    static String reverseString03(String str){
        char ch[]=str.toCharArray();
        int i=ch.length-1;
        rev+=ch[i];
        i--;
        return rev;     
    }
    public static void main(String[] args) {
        System.out.println(C19_reverseString03.reverseString03("Rishav"));
    }
}
