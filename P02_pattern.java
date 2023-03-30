package com.exchange;

public class P02_pattern {
    public static void main(String[] args) {
        for (int i=0;i<=4;i++){
            for (int j=0;j<=4;j++){
                if (i>j){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
