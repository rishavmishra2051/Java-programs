package com.exchange;

public class M03_maxinarr02 {
    static void max(int arr[]){
        boolean isMax;
        for(int i=0;i<arr.length;i++){
            isMax=true;
            for(int j=0;j<arr.length;j++){
                if(arr[j]>arr[i]s){
                    isMax=false;
                    break;
                }
            }
            if(isMax){
                System.out.println("Max Element:"+arr[i]);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,8,4,3,6,9};
        max(arr);
    }
}
