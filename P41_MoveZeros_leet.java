package com.exchange;

public class P41_MoveZeros_leet {
    public static void moveZeroes(int[] nums) {
        int n= nums.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n-1;j++){
                if (nums[j]==0){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        moveZeroes(nums);
    }
}
