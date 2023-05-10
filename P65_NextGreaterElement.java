package com.exchange;
import java.util.*;
public class P65_NextGreaterElement {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nxtGreater[]=new int[arr.length];
        //For next greater/smaller right side
        for(int i=arr.length-1;i>=0;i--){
        /*For next greater/smaller left side
        for(int i=arr.length-1;i>=0;i--){*/
            //1.While
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
            /*For next smaller right/left
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){ */
               s.pop(); 
            }
            //2.if-else
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }
            else{
                nxtGreater[i]=arr[s.peek()];
            }
            //push in s
            s.push(i);
        }
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}
