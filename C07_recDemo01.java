package com.exchange;

public class C07_recDemo01 {
    static void show(int val){
        if(val==5){
            return;
        }
        //System.out.println(val);
        show(val+1);
        System.out.println(val);
    }
    public static void main(String[] args) {
        show(1);
    }
}
