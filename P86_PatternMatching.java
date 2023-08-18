package com.exchange;

public class P86_PatternMatching {
    public static void main(String[] args) {
        String str="ABCABCD";
        String pat="ABC";
        int n=str.length(),k=pat.length();
        for(int i=0;i<n-k;i++){
            int j;
            for(j=0;j<k;j++){
                if(str.charAt(i+j)==pat.charAt(j)){
                    break;
                }
            }
            if(j==k){
                System.out.println("Pattern found at index "+i);
            }
    }
    }
}
