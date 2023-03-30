package com.exchange;

import java.util.ArrayList;
import java.util.Collections;

public class P17_DuplicateInArray {
    static ArrayList<Integer> duplicator(int arr[],int n){
        ArrayList<Integer> t=new ArrayList<Integer>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    t.add(arr[i]);
                }
            }
        }
        ArrayList<Integer> t1=new ArrayList<Integer>();
        for(int e:t){
            if(!t1.contains(e)){
                t1.add(e);
            }
        }
        Collections.sort(t1);
        if (t1.isEmpty()){
            t1.add(-1);
        }
        return t1;
    }
    public static void main(String[] args) {
        int arr[]={13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};
        int n= arr.length;
        ArrayList<Integer> t=duplicator(arr,n);
        for(int e:t){
            System.out.println(e);
        }
    }
}
