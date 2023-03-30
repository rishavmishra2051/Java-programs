package com.exchange;

import java.util.Scanner;

public class C02_armstrongnumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        int temp=num;
        int result=0;
        while (num!=0){
            int rem=num%10;
            result+=Math.pow(rem,3);
            num=num/10;
        }
        if (result==temp){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}
