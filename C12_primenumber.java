package com.exchange;

public class C12_primenumber {
    
    static void primeNo(int num,int div){
        if(num==div){
            System.out.println("Prime");
            return;
        }
        int rem=num%div;
        if(rem==0){
            System.out.println("Not prime");
            return;
        }
        primeNo(num,div+1);
    }
    public static void main(String[] args) {
        primeNo(7,2);
    }
}
