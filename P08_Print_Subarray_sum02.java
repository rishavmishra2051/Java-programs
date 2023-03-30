package com.exchange;
//Using Prefix sum
public class P08_Print_Subarray_sum02 {
    public static void main(String[] args) {
        int num[]={1,-2,6,-1,3};
        int sum=0,max=Integer.MIN_VALUE;
        //Calculate prefix[]
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        //Print prefix
        for(int i=0;i<prefix.length;i++){
            System.out.println(prefix[i]+" ");
        }
        //Calculate sum of subarray
        for (int i=0;i< num.length;i++){
            for (int j=i;j<num.length;j++){
                sum= i==0?prefix[j]:prefix[j]-prefix[i-1] ;  
                if(max<sum){
                    max=sum;
                }         
            }
        }
        System.out.println("Max sum is: "+max);
    }
}
