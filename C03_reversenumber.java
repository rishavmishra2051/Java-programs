package com.exchange;

import java.util.Scanner;

public class C03_reversenumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        int result=0;
        while (num!=0){
            int rem=num%10;
            result=result*10+rem;
            num=num/10;
        }
        System.out.println(result);
    }
}
