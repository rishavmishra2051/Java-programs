package com.exchange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class P101_Array_Practice {
    public static int removeDuplicates(int[] arr) {
		HashSet < Integer > t = new HashSet < > ();
        for(int i=0;i<arr.length-1;i++){
            t.add(arr[i]);
        }
		return t.size();
	}
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int t=arr[0];
        for (int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=t;
        return arr;
    }
    
    public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        ArrayList <Integer> t = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                t.add(a[i]);
            }
        }
        int s=t.size();
        for(int i=0;i<s;i++){
            a[i]=t.get(i);
        }
        for(int i=s;i<n;i++){
            a[i]=0;
        }
        return a;
    }
    public static HashSet unionOfArray(int a[], int b[]){
        HashSet<Integer> t = new HashSet<>();
        for(int i=0;i<a.length;i++){
            t.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            t.add(b[i]);
        }
        return t;
    }
    static int consecutiveOnes(int a[]){
        int n=a.length,t=0,max=0;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                t++;
                if(t>max){
                    max=t;
                }
            }else{
                t=0;
            }
        }
        return max;
    }
    public static long maxSubarraySum(int[] v, int n) {
		// write your code here
		int t=0;
        long max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				t+=v[j];
				if(t>max){
					max=t;
				}
			}
            t=0;
		}
		return max;
	}
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        Arrays.sort(a);
        int n=a.length,c=0,t=1;
        for(int i=0;i<n-1;i++){         
            if(a[i]+1==a[i+1]){
                t++;
                if(t>c){
                    c=t;
                }
            }else if(a[i]==a[i+1]){
                continue;
            }else{
                t=1;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int arr1[] = {1,1,2,2,2,3,3};
        int arr2[]={1,2,3,4,5};
        int arr3[]={1,0,2,3,0,4,6};
        int arr4[]={1, 1, 0, 1, 1, 1};
        int arr5[] = {15, 6, 2, 1, 16, 4, 2, 29, 9, 12, 8, 5, 14, 21, 8, 12, 17, 16, 6, 26, 3};    
        System.out.println(removeDuplicates(arr1));
        print(rotateArray(arr2, 5));
        print(moveZeros(arr3.length, arr3));
        System.out.println(unionOfArray(arr2, arr3));
        System.out.println(consecutiveOnes(arr4));
        System.out.println(maxSubarraySum(arr2, arr2.length));
        Arrays.sort(arr5);
        print(arr5);
        System.out.println(longestSuccessiveElements(arr5));
    }
    static void print(int a[]){
        int n=a.length;
        System.out.print("Result is [ ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("]");
    }
    static void printList(ArrayList<Integer> t){
        for(int e:t){
            System.out.print(e+" ");
        }
    }
}
