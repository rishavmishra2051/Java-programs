package com.exchange;
//Maximum sum of k consecutive numbers
public class M09_MaximumSumOfKElements {
    public static int maximumSum(int arr[],int k){
        int n=arr.length,max=Integer.MIN_VALUE,temp=0;
        for(int i=0;i<k;i++){
            temp+=arr[i];
        }
        if(temp>max){
            max=temp;
        }
        for(int i=k;i<n-1;i++){
            int t=temp+arr[i]-arr[i-k];
            if(t>max){
                max=t;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,40,30,10,20,5};
        System.out.println(maximumSum(arr,3));
    }
}

