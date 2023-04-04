package com.exchange;

public class P27_BinarySearch {
    static int binarySearch(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;    //mid=(start_idx-end_idx)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 4));
    }
}
