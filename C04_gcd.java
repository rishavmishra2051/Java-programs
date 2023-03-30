package com.exchange;

import java.util.Scanner;

public class C04_gcd {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int m=scan.nextInt();
        int rem=1;
        while(n%m!=0){
            rem=n%m;
            n=m;
            m=rem;
        }
        System.out.println("GCD: "+m);
    }
}
