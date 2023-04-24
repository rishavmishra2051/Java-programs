package com.exchange;

public class M07_MajorityElementsInArray {
    public static int majorityElement(int[] arr){
        int majority=0,count=0,n=arr.length;
        for(int i=0;i<n;i++){
            if(count==0){
                majority=arr[i];
            }
            if(majority==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]==majority){
                temp++;
            }
        }
        System.out.println("No. of time: "+temp);
        return majority;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
