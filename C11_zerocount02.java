package com.exchange;

public class C11_zerocount02 {
    int sumofDigit(int num){
        if(num==0){
            return 0;
        }
        int count=sumofDigit(num/10);
        int singleDigit=num%10;
        if(singleDigit==0){
            return count++;
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}

