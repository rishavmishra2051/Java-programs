package com.exchange;

public class P22_Recursion_Basics {
    //Print decreasing order
    static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    //Print increasing order
    static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    //Print factorial
    static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int fact=n*Factorial(n-1);
        return fact;
    }
    //Sum of n natural numbers
    static int sum_of_natural_no(int n){
        if(n==1){
            return 1;
        }
        int sum=n+sum_of_natural_no(n-1);
        return sum;
    }
    //Fibonacci number 0 1 1 2 3 5 8 13 21 34
    static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        int f1=fibonacci(n-1);
        int f2=fibonacci(n-2);
        int fn=f1+f2;
        return fn;
    }
    //Array is sorted or not
    static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<=arr[i+1]){
            return isSorted(arr, i+1);
        }
        return false;
    }
    //First occurance
    static int first_occurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first_occurance(arr, key, i+1);
    }
    //Last occurance
    static int last_occurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=last_occurance(arr, key, i+1);
        if(isFound==-1&&arr[i]==key){
            return i;
        }
        return isFound;
    }
    //Calculating power
    static int cal_power(int num,int pow){
        if(pow==0){
            return 1;
        }
        return num*cal_power(num, pow-1);
    }
    //Calculating power in optimized time O(log n)
    static int cal_power_optimized(int num,int pow){
        if(pow==0){
            return 1;
        }
        int halfpower=cal_power_optimized(num, pow/2);
        int halfpowersq=halfpower*halfpower;
        if(pow%2!=0){
            halfpowersq=num*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        //printDec(10);
        //printInc(10);
        //System.out.println(Factorial(5));
        //System.out.println(sum_of_natural_no(5));
        //System.out.println(fibonacci(7));
        //int arr[]={1,2,3,4,5,6};
        //System.out.println(isSorted(arr, 0));
        //int arr1[]={8,3,6,9,5,10,2,5,3};
        //System.out.println("First occurance of 5 is at index "+first_occurance(arr1,5,0));
        //System.out.println("Last occurance of 5 is at index "+last_occurance(arr1,5,0));
        //System.out.println(cal_power(2, 10));
        System.out.println(cal_power_optimized(2, 10));
    }
}
