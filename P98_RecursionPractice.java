package com.exchange;

import java.util.Arrays;

public class P98_RecursionPractice {
    
    static int sum(int n){
        if(n==1){
            return 1;
        }
        int sn=sum(n-1);
        return (n+sn);
    }
    static int fact(int n){
        if(n==1){
            return 1;
        }
        int sn=fact(n-1);
        return (n*sn);
    }
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibN1=fib(n-1);
        int fibN2=fib(n-2);
        
        return (fibN1+fibN2);
    }
    static boolean isSorted(int a[],int i){
        if(i==a.length-1){
            return true;
        }
        if(a[i]>a[i+1]){
            return false;
        }
        return isSorted(a, i+1);
    }
    static int firstOccurance(int a[],int i,int key){
        if(i==a.length){
            return -1;
        }
        if(a[i]==key){
            return i;
        }
        return firstOccurance(a, i+1, key);
    }
    static int xpown(int x,int n){
        if(n==1){
            return x;
        }
        return x*xpown(x, n-1);
    }
    static int optimized_xpown(int x,int n){
        if(n==1){
            return x;
        }
        if(n%2==0){
            return xpown(x, n/2)*xpown(x, n/2);
        }else{
            return x*xpown(x, n/2)*xpown(x, n/2);
        }
        
    }
    static int tilingproblem(int n){  //2xn floor size
        if(n==0||n==1){
            return 1;
        }
        //vertical choice
        int vc=tilingproblem(n-1);
        //horizontal choice
        int hc=tilingproblem(n-2);
        return vc+hc;
    }
    static void remove_Duplicate(String s,int i,StringBuilder sb, boolean map[]){
        if(i==s.length()){
            System.out.println(sb);
            return;
        }
        char c=s.charAt(i);
        if(map[c-'a']==true){
            remove_Duplicate(s, i+1, sb, map);
        }else{
            map[c-'a']=true;
            remove_Duplicate(s, i+1, sb.append(c), map);
        }
    }
    static int friends_pairing(int n){
        if(n==1||n==2){
            return n;
        }
        int single=friends_pairing(n-1);
        int doubl=(n-1)*friends_pairing(n-2);
        return single+doubl;
    }
    static void printBinaryString(int n,int lastplace,String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        printBinaryString(n-1, 0, s+"0");
        if(lastplace==0){
           printBinaryString(n-1, 1, s+"1");
         
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
        System.out.println(fact(5));
        System.out.println(fib(7));
        int arr[]={1,2,3,4};
        System.out.println(isSorted(arr, 1));
        System.out.println(firstOccurance(arr, 0, 4));
        System.out.println(xpown(2, 10));
        System.out.println(optimized_xpown(2, 10));
        System.out.println(tilingproblem(4));
        remove_Duplicate("fhsjhdhfgp", 0, new StringBuilder(""), new boolean[26]);
        System.out.println(friends_pairing(3));
        printBinaryString(3, 0, "");
    }
}
