package com.exchange;

public class P26_Seach_SortedRotated_Array {
    static int search(int arr[],int target,int start_idx,int end_idx){
        int mid=start_idx+(end_idx-start_idx)/2;
        if(start_idx>end_idx){
            return -1;
        }
        if(mid==arr[mid]){
            return mid;
        }
        //mid on L1
        if(arr[start_idx]<=end_idx){
            //case a: search in left
            if(arr[start_idx]<=target && target<=arr[mid]){
                return search(arr, target, start_idx, mid-1);
            }
            //case b: search in right
            else{
                return search(arr, target, mid+1, end_idx);
            }
        }
        //mid on L2
        else{
            //case a: search in right
            if(arr[mid]<=target && target<=arr[end_idx]){
                return search(arr, target, mid+1, end_idx);
            }
            //case b: search in left
            return search(arr, target, start_idx, mid-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}
