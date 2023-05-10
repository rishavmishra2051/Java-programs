package com.exchange;
import java.util.*;
public class P62_ReverseStringUsingStack {
    static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb=new StringBuilder("");
        while(!s.isEmpty()){
            char c=s.pop();
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="abc";
        System.out.println(reverseString(s));
    }
    

}
