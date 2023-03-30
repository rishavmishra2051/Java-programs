package com.exchange;
// sum of digit
public class C08_recDemo02 {
    static int sum=0;
    static void sumofDigit(int num,int sum){
        if(num==0){
            System.out.println("sum = "+sum);
            return;
        }
        int singleDigit=num%10;
        sum=sum+singleDigit;
        
        sumofDigit(num/10,sum);
    }
    public static void main(String[] args) {
        sumofDigit(123,0);
    }
}
