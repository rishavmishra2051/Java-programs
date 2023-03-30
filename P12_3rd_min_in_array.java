package com.exchange;

import java.util.Arrays;

public class P12_3rd_min_in_array {
    public static void main(String[] args) {
        int arr[]={5,7,3,4};
        int k=3;//kth smallest element
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
