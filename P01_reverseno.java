package com.exchange;

public class P01_reverseno {
    static int ispalindrom(int n){
        int rev=0;
        while (n>0){
            int pow=0;
            int rem=n%10;
            rev=rev*10+rem;
            pow++;
            n=n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(ispalindrom(143));
    }
}
