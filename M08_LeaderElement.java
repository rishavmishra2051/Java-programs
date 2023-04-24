package com.exchange;

import java.util.ArrayList;

public class M08_LeaderElement {
    public static void main(String[] args) {
        int arr[]={5,2,8,9,7,2};
        int n=arr.length;
        int leader=arr[n-1];
        ArrayList<Integer>t=new ArrayList<>();
        t.add(leader);
        for (int i=n-1;i>=0;i--){
            if(arr[i]>leader){
                t.add(arr[i]);
                leader=arr[i];
            }
        }
        for(int e:t){
            System.out.print(e+" ");
        }
    }
}
