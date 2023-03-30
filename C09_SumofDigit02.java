package com.exchange;

public class C09_SumofDigit02 {
    
    int sumofDigit(int num){
        if(num==0){
            return 0;
        }
        int sum=sumofDigit(num/10);
        int singleDigit=num%10;
        return sum+singleDigit;
        
        
    }
    public static void main(String[] args) {
        
    }
}
