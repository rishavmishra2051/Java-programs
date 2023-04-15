package com.exchange;

public class P37_SingleNumber_leet {
    public static int singleNumber(int[] nums) {
        int n=nums.length;
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count!=2){
                return nums[i];
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int nums[]={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
