package com.exchange;

public class C10_zerocount {
    static void sumofDigit(int num,int count){
        if(num==0){
            System.out.println("Count = "+count);
            return;
        }
        int singleDigit=num%10;
        if(singleDigit==0){
            count++;
        }
        
        sumofDigit(num/10,count);
    }
    public static void main(String[] args) {
        sumofDigit(1023040,0);
    }
}
