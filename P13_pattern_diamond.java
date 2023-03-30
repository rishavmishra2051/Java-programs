package com.exchange;

public class P13_pattern_diamond {
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<=n;i++){
            for (int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                if (i>=j){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            for (int j=n;j>0;j--){
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
