package com.exchange;

public class C16_armstrongno_1toN {
    static int result=0;
    static void armstrongno_1toN(int num,int org_num){
        if(num==0){
            if(result==org_num){
                System.out.println(org_num);
            }
            return;
        }
        int rem=num%10;
        result=result+rem*rem*rem;
        armstrongno_1toN(num/10,org_num);
    }
    static void rec(int num,int num1){
        if(num==num1){
            return;
        }
        armstrongno_1toN(num, num);
        rec(num+1, num1);
    }
    public static void main(String[] args) {
        rec(153,10000);
       //armstrongno_1toN(153, 10000);
    }
}
