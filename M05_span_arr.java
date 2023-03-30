package com.exchange;

public class M05_span_arr {
    public static void main(String[] args) {
        int arr[]={51,72,37,46,64,41,57,85};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int min=max;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int span=max-min; 
        System.out.println("Maximum:"+max);
        System.out.println("Minimum:"+min);
        System.out.println("Span:"+span);
    }
}
