package com.exchange;

import java.util.Arrays;

public class P38_Majority_Element_leet {
    public static int singleNumber(int[] nums) {
        int n=nums.length,count=Integer.MIN_VALUE,result=0;
        int temp=0;
        if(n==1){
            return nums[0];
        }
        Arrays.sort(nums);
        if(n<4){
            for (int i=0;i<n-1;i++){
                if(nums[i]==nums[i+1]){
                    return nums[i];
                }
            }
        }
        for (int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                temp++;
                if(temp>count){
                    count=temp;
                    result=nums[i];
                }
            }
            else {
                temp=0;
            }
        }
        if(count>(n/2)-1){
            return result;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(singleNumber(nums));
    }
}
