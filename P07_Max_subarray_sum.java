package com.exchange;
//Using Brute force
public class P07_Max_subarray_sum {
    public static void main(String[] args) {

        // Write your code here.
        int num[]={2,4,6,8,10};
        int max=Integer.MIN_VALUE, temp=0;
        for (int i=0;i<num.length;i++){
            System.out.println("Subarray of "+num[i]+" is ");
            for (int j=i;j<num.length;j++){
                temp=0;
                for (int k=i;k<=j;k++){
                    System.out.print(num[k]+" ");
                    temp+=num[k];
                }
                System.out.println();
                System.out.println("Sum: "+temp);
                if(temp>max){
                    max=temp;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Subarray sum is "+max);
    }
}
