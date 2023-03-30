package com.exchange;

public class P06_Printsubarray {
    public static void main(String[] args) {

        // Write your code here.
        int num[]={2,4,6,8,10};
        int ts=0;
        for (int i=0;i<num.length;i++){
            System.out.println("Subarray of "+num[i]+" is ");
            for (int j=i;j<num.length;j++){
                for (int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays: "+ts);
    }
}
