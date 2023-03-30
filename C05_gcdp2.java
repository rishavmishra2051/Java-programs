package com.exchange;

import java.util.Scanner;

public class C05_gcdp2 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();
        int y=scan.nextInt();
        while(x!=y){
            if(x>y){
                x=x-y;
            }
            else{
                y=y-x;
            }
        }
        System.out.println("GCD: "+x);
    }
}
