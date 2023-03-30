package com.exchange;

public class P23_Tiling_problem {
    static int tiling_problem(int n){
        if(n==0||n==1){
            return 1;
        }
        int fn1=tiling_problem(n-1);
        int fn2=tiling_problem(n-2);
        int ways=fn1+fn2;
        return ways;                                                                                                                                                                                                             
    }
    public static void main(String[] args) {
        System.out.println(tiling_problem(5));
    }
}
