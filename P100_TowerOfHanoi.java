package com.exchange;

public class P100_TowerOfHanoi {
    static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper,src, dest);
    }
    public static void main(String[] args) {
        towerOfHanoi(3, "Source", "Helper", "Destination");
    }
}
