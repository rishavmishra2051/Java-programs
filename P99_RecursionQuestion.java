package com.exchange;

import java.util.ArrayList;

public class P99_RecursionQuestion {
    static ArrayList<Integer> occurances(int arr[],int key,int i,ArrayList<Integer> t){
        if(i==arr.length){
            return t;
        }
        if(arr[i]==key){
            t.add(i);
        }
        return occurances(arr, key, i+1, t);
    }
    static int string_Length(String s){
        if(s.length()==0){
            return 0;
        }
        return string_Length(s.substring(1))+1;
    }
    static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    static void printDigit(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        printDigit(n/10);
        System.out.print(digit[rem]+" ");
    }
    
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        System.out.println(occurances(arr, 2, 0,new ArrayList<>()));
        System.out.println(string_Length("Rishav"));
        printDigit(2019);
    }
}
