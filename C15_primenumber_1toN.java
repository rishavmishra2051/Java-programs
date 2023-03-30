package com.exchange;

public class C15_primenumber_1toN {
    static int i=5;
    static void primenumber_1toN(int num,int num1){
        if(num1==num){
            return;
        }
        if(num%2!=0&&num%3!=0&&num%i!=0){
            System.out.println(num);
        }
        i+=6;
        primenumber_1toN(num+1,num1);
    }
    public static void main(String[] args) {
        primenumber_1toN(1,21);
    }
}
