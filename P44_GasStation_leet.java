package com.exchange;

import java.util.Arrays;

public class P44_GasStation_leet {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int a= Arrays.stream(gas).sum();
        int b=Arrays.stream(cost).sum();
        if (a - b < 0) {
            return -1;
        }
        int result = 0;
        int sum = 0;
        int loss=0;

        for (int i = 0; i < n; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0) {
                loss+=sum;
                result = i + 1;
                sum = 0;
            }
        }
        /*
         * For more testcases
         * if((result+loss)>=0){
         * return index;
         * }
         */
        return result;
    }


    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}
