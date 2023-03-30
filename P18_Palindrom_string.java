package com.exchange;

public class P18_Palindrom_string {
    static boolean palindrom(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="amit";
        System.out.println(palindrom(str));
    }
}
