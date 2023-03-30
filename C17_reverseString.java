package com.exchange;

public class C17_reverseString {
    static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        
        sb.reverse();
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(C17_reverseString.reverseString("Rishav"));
    }
}
