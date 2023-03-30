package com.exchange;

import java.util.Scanner;

public class C06_odd_even {
    public static void main(String[] args) { 
        System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        if((num&1)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
