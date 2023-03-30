package com.exchange;

public class P25_RotateArray {
    static void rotatearray(int arr[]){
        int n=arr.length,d=8;
        int temp[]=new int[n];
        for (int i=d,k=0;i<n;i++,k++){
            temp[k]=arr[i];
        }
        for (int i=d-1;i>=0;i--){

            for (int j=n-d;j<=n-1;j++){
                int tem=arr[j];
                arr[j]=arr[i];
                arr[i]=tem;
            }
        }
        for(int i=n-d,k=n-d;i<n;i++,k++){
            temp[k]=arr[i];
        }
        for (int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,56,565,65,656,45,15,41,454,145};
        rotatearray(arr);
    }
}
