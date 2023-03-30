package com.exchange;

import java.util.ArrayList;

public class C22_ArrayList_demo {
    static ArrayList<Integer> search(int arr[],int index,int searchvalue){
        if(index==arr.length){
            return new ArrayList<Integer>();
        }
        if(arr[index]==searchvalue){
            ArrayList<Integer> t=search(arr, index+1, searchvalue);
            t.add(index);
            return t;
        }
        return search(arr, index+1, searchvalue);
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,40,40,40,50,40,60};
        ArrayList<Integer> t=search(a, 0, 40);
        for(int e:t){
            System.out.print(e+" ");
        }
    }
}
