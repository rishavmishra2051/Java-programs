package com.exchange;

public class C13_armstrongno {
    static int result=0;
    static void armstrongno(int num,int org_num){
        if(num==0){
            if(result==org_num){
                System.out.println("Armstrong number");
            }
            else{
                System.out.println("Not Armstrong number");
            }
            return;
        }
        int rem=num%10;
        result=result+rem*rem*rem;
        armstrongno(num/10,org_num);
    }
    public static void main(String[] args) {
        armstrongno(153,153);
    }
}
