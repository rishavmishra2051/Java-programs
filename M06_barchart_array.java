package com.exchange;

public class M06_barchart_array {
    public static void main(String[] args) {
        int arr[]={3,4,0,7,5};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
