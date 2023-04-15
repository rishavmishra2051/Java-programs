package com.exchange;

import java.util.Arrays;

public class P39_ContainsDuplicates_leet {
    public static boolean containsDuplicate(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        for (int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    //219. Contains Duplicate II
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int n= nums.length;
        for (int i=0;i<n-k;i++){
            for (int j=i+1;j<k;j++){
                if(nums[i]==nums[j]&&Math.abs(i - j) <= k){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(containsDuplicate(nums));
        int nums1[] = {1,2,3,1}, k = 2;
        System.out.println(containsNearbyDuplicate(nums1,k));
    }
}
