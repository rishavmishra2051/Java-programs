package com.exchange;

import java.util.ArrayList;

public class P97_Longest_Substring {
    static int longest_String(String s){
        int n=s.length();
        ArrayList<Character>t=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(t.contains(s.charAt(i))){
                return t.size();
            }
            else{
                char c=s.charAt(i);
                t.add(c);
            }
        }
        return t.size();
    }
    public static void main(String[] args) {
        String s="abcdefhxscudg";
        System.out.println(longest_String(s));
    }
}
