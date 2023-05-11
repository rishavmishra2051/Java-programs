package com.exchange;

import java.util.Arrays;
import java.util.Comparator;

//ratio=value/weight
public class P80_FractionalKnapsack {
    public static void main(String[] args) {
        int weight[]={10,20,30};
        int value[]={60,100,120};
        int capacity=50;
        int n=weight.length;
        int maxvalue=0;
        double ratio[][]=new double[n][2];
        //0th col => idx; 1st col => ratio
        for(int i=0;i<n;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        //Ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        for(int i=n-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                maxvalue+=value[idx];
                capacity-=weight[idx];
            }else{
                maxvalue+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("Maximum value of knapsack: "+maxvalue);
    }
}
