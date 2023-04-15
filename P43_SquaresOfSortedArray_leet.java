package com.exchange;

import java.util.Arrays;

public class P43_SquaresOfSortedArray_leet {
    public static void print(int[] nums){
        int n= nums.length;
        for (int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int n= nums.length;;
        for (int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int[] num1=new int[nums.length];
        num1=sortedSquares(nums);
        print(num1);
    }
}
