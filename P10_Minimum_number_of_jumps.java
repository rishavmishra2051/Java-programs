package com.exchange;

public class P10_Minimum_number_of_jumps {
    public static void main(String[] args) {
        int arr[]={1,3,5,8,9,2,6,7,6,8,9};
        int count=0;
        for(int i=0;i<arr.length-1;i+=arr[i]){
            count++;
        }
        System.out.println(count);
    }
}
/* problem:-Time complexity
Input:
N = 11 
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
Output: 3 
Explanation: 
First jump from 1st element to 2nd 
element with value 3. Now, from here 
we jump to 5th element with value 9, 
and from here we will jump to the last. 
 */
//https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&sortBy=submissions