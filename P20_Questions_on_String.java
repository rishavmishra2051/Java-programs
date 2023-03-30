package com.exchange;

public class P20_Questions_on_String {
    static int totallowercasevowel(String str){
        int count=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="Rishav";
        System.out.println(totallowercasevowel(str));
    }
}
