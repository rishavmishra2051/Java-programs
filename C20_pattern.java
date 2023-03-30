package com.exchange;

public class C20_pattern {
    public static void pattern1(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (i==j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern2(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (i==0||j==0||i==3||j==3){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern4(){
        for (int i=0;i<4;i++){
            for (int j=0;j<=4-i;j++){
                System.out.print(" ");
            }
            //for stars
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
    }
}
