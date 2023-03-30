package com.exchange;

import java.util.Scanner;

public class P15_2D_array {
    //Print 2D Array
    static void Printarr(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        } 
    }
    //Find Largest and Smallest element
    public static void largeandsmall(int matrix[][]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+min);
    }
    //No. of times element come
    static int elementtimes(int matrix[][],int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    count++;
                }
            }
        }
        return count;
    }
    //Sum of second row
    static int Sumofsecondrow(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[1][i];
        }
        return sum;
    }
    //Transpose of matrix
    static void Transposematrix(int matrix[][],int row,int col){
        int[][] transpose=new int[col][row];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        Printarr(transpose);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of 2D array");
        int n=scan.nextInt();
        int m=scan.nextInt();
        int matrix[][]=new int [n][m];
        System.out.println("Enter elements in array");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=scan.nextInt();
            }
        }
        System.out.println("2D Array");
        Printarr(matrix);
        largeandsmall(matrix);
        int matrix01[][]={{4,7,8},{8,8,7}};
        /*int matrix02[][]={{1,4,9},{11,4,3},{2,2,3}};
        System.out.println(elementtimes(matrix01, 7));
        System.out.println(Sumofsecondrow(matrix02));*/
        Printarr(matrix01);
        Transposematrix(matrix01, 2, 3);
    }
}
