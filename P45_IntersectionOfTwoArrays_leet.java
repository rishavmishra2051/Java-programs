package com.exchange;

import java.util.ArrayList;
import java.util.List;

public class P45_IntersectionOfTwoArrays_leet {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int n= nums1.length,m= nums2.length;
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    ans.add(nums1[i]);
                }
            }
        }
        ArrayList<Integer> t=new ArrayList<Integer>();
        for(int e:ans){
            if(!t.contains(e)){
                t.add(e);
            }
        }
        return t.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int [] result=intersection(nums1,nums2);
        print(result);
    }

    public static void print(int[] nums){
        int n= nums.length;
        for (int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
