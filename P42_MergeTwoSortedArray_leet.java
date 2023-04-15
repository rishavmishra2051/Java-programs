package com.exchange;

import java.util.Arrays;

public class P42_MergeTwoSortedArray_leet {
    public static void print(int[] nums){
        int n= nums.length;
        for (int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
        print(nums1);
    }

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0},nums2={2,4,5};
        merge(nums1,3,nums2, nums2.length);
    }
}
