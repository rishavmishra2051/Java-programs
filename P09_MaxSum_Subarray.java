package com.exchange;
//Using Kadanes algorithm
public class P09_MaxSum_Subarray {
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        //int num[]={-1,-2,-3,-4};
        int current_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            current_sum+=num[i];
            if(current_sum<0){
                current_sum=0;
            }
            max_sum=Math.max(max_sum, current_sum);
        }
        /*if(max_sum==0){
            for(int i=0;i<num.length;i++){

            }
        }*/
        System.out.println("Max sumarray sum is "+max_sum);
    }
}
