package com.exchange;

public class C14_num_op {
    static int even=0,odd=0;
    static void num_op(int num){
        if(num==0){
            System.out.println("Sum of even digit : "+even);
            System.out.println("Sum of odd digit : "+odd);
            return;
        }
        int rem=num%10;
        if(rem%2!=0){
            even=even+rem;
        }
        else{
            odd=odd+rem;  
        }
        num_op(num/10);
    }
    public static void main(String[] args) {
        num_op(123456);
    }
}
