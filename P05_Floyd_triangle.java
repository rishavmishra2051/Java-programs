package com.exchange;

public class P05_Floyd_triangle {
    public static void main(String[] args) {
        int n=5,m=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(m);
                m++;
            }
            System.out.println();
        }
    }
}
