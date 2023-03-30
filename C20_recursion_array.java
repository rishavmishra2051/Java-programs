package com.exchange;

public class C20_recursion_array {
    static boolean issorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return issorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        System.out.println(issorted(arr, 0)?"Sorted":"Not Sorted");
    }
}
