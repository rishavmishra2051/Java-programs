package com.exchange;

public class P14_Sorting {
    //Bubble sort
    public static void bubblesort(int arr[]){
        for (int turn=0;turn< arr.length-1;turn++){
            for (int i=0;i< arr.length-1-turn;i++){
                if (arr[i]>arr[i+1]){
                //if (arr[i]<arr[i+1]){     for decreasing order    
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    //Selection sort
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for (int turn=0;turn< n-1;turn++){
            int minPos=turn;
            for (int i=turn+1;i< n;i++){
                if (arr[minPos]>arr[i]){
                //if (arr[minPos]>arr[i]){    for decreasing order
                    minPos=i;
                }
            }
            //swap
            int temp=arr[minPos];
            arr[minPos]=arr[turn];
            arr[turn]=temp;
        }
    }
    //Insertionsort
    public static void insertionsort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //Finding out the current position to insert
            while(prev>=0 && arr[prev]>curr){
            //while(prev>=0 && arr[prev]>curr){       For decreasing order
                arr[prev+1]=arr[prev];
                prev--;
            }
            //Inserting
            arr[prev+1]=curr;
        }
    }
    //Counting sort
    public static void countingsort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
        //for(int i= count.length-1;i>=0;i--){    for decreasing order    
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    //Merge sort
    public static void mergesort(int arr[], int start_idx, int end_idx){
        //Base case
        if(start_idx>=end_idx){
            return;
        }
        int mid_idx=start_idx+(end_idx-start_idx)/2;//(start_idx+end_idx)/2
        mergesort(arr, start_idx, mid_idx);
        mergesort(arr, mid_idx+1, end_idx);
        merge(arr, start_idx, mid_idx, end_idx);
    }
    public static void merge(int arr[], int start_idx, int mid_idx, int end_idx){
        int temp[]=new int[end_idx-start_idx+1];
        int i=start_idx;//Iterator for left part
        int j=mid_idx+1;//Iterator for right part
        int k=0;//Iterator for temp array
        while(i<=mid_idx&&j<=end_idx){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;k++;
            }
            else{
                temp[k]=arr[j];
                j++;k++;
            }
            //For remaining elements of left part
            while(i<=mid_idx){
                temp[k++]=arr[i++];
            }
            //For remaining elements pf right part
            while(j<=end_idx){
                temp[k++]=arr[j++];
            }
            //Copy temp array to original array
            for(k=0,i=start_idx;k<temp.length;k++,i++){
                arr[i]=temp[k];
            }
        }
    }
    //Print array
    public static void Printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {5,4,1,3,2};
        bubblesort(arr);
        Printarr(arr);
        selectionsort(arr);
        Printarr(arr);
        insertionsort(arr);
        Printarr(arr);
        countingsort(arr);
        Printarr(arr);
        mergesort(arr, 0, arr.length-1);
        Printarr(arr);
    }
}
