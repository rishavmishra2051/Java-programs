package com.exchange;

public class P87_RabinKarpStringMatching {
    public static void main(String[] args) {
        String str="ABCDACBABC";
        String pat="ABC";
        int n=str.length(),k=pat.length();
        int d=26;
        int q=13;//PRIME NUMBER
        int patternHash=0;
        int StringHash=0;
        //Calculate pattern hash
        for(int i=0;i<k;i++){
            patternHash+=(pat.charAt(i)*d)%q;
            StringHash+=(str.charAt(i)*d)%q;
        }
        for(int i=1;i<n;i++){
            if(patternHash==StringHash){
                int j;
                for(j=1;j<n;j++){
                    if(str.charAt(i+j)==pat.charAt(j)){
                        break;
                    }
                    if(j==k){
                        System.out.println("Pattern found at index "+i);
                    }
                }
                
            }
        }
    }
}
