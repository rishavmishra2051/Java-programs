package com.exchange;

public class M02_maxinarr {
    public static void main(String[] args) {
        int arr[]={5,7,3,4};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum:"+max);
    }
}
