package com.exchange;

import java.util.Scanner;

public class C01_primenumber {
    public static void main(String[] args) {
        // write your code here
            System.out.println("Enter a number");
            Scanner scan=new Scanner(System.in);
            int n= scan.nextInt();
            int iter=0;
            boolean isprime=false;
            if (n==0&&n==1){
                System.out.println(n+" is not a prime number");
            }
            if (n%2==0||n%3==0){
                isprime=false;
            }
            for (int i=5;i*i<=n;i+=6){
                iter++;
                if (n%i==0||n%(i+2)==0){
                    isprime=false;
                    break;
                }
            }
            System.out.println("Number of iterations : "+iter);
            if (isprime){
                System.out.println("Prime number");
            }
            else{
                System.out.println("Not prime number");
            }
        }
}
