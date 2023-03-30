package com.exchange;

public class M04_secondmax_in_arr {
    public static void main(String[] args) {
        int arr[]={5,7,3,4};
        int max=0,max2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
        }
        System.out.println("Second Maximum:"+max2);
    }
}
