package com.exchange;

import java.util.Arrays;

public class P40_MissingNumbers_leet {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for (int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int nums[]={0,1};
        System.out.println(missingNumber(nums));
    }
}
