package com.exchange;

import java.util.ArrayList;

public class P32_No_OfVowelStringsinRange {
    public static int vowelStrings(String[] words, int left, int right) {
        ArrayList<String> finalresult=new ArrayList<String>();
        for (int i=left;i<=right;i++){
            String s=words[i];
            if ((s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u')&&(s.charAt(s.length()-1)=='a'||s.charAt(s.length()-1)=='e'||s.charAt(s.length()-1)=='i'||s.charAt(s.length()-1)=='o'||s.charAt(s.length()-1)=='u')){
                finalresult.add(s);
            }
        }
        return finalresult.size();
    }
    public static ArrayList<String> vowelStringsPrint(String[] words, int left, int right) {
        ArrayList<String> finalresult=new ArrayList<String>();
        for (int i=left;i<=right;i++){
            String s=words[i];
            if ((s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u')&&(s.charAt(s.length()-1)=='a'||s.charAt(s.length()-1)=='e'||s.charAt(s.length()-1)=='i'||s.charAt(s.length()-1)=='o'||s.charAt(s.length()-1)=='u')){
                finalresult.add(s);
            }
        }
        return finalresult;
    }

    public static void main(String[] args) {
        String  words[]={"hey","aeo","mu","ooo","artro"};
        System.out.println("No. of string vowels: "+vowelStrings(words,1,4));
        ArrayList<String> t=new ArrayList<String>();
        t=vowelStringsPrint(words,1,4);
        for(String e:t){
            System.out.print(e+" ");
        }
    }
}
