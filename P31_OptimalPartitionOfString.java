package com.exchange;

import java.util.ArrayList;

public class P31_OptimalPartitionOfString {
    public static int partitionString(String s) {
        ArrayList<String> finalresult=new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char firstchar=s.charAt(i);
            String str=""+firstchar;
            if(sb.toString().contains(str)){
                finalresult.add(sb.toString());
                sb.delete(0,sb.length());
            }
            sb.append(str);
        }
        finalresult.add(sb.toString());
        return finalresult.size();
    }
    public static ArrayList<String> partitionStringPrint(String s){
        ArrayList<String> finalresult=new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char firstchar=s.charAt(i);
            String str=""+firstchar;
            if(sb.toString().contains(str)){
                finalresult.add(sb.toString());
                sb.delete(0,sb.length());
            }
            sb.append(str);
        }
        finalresult.add(sb.toString());
        return finalresult;
    }
    public static void main(String[] args) {
        String s = "ssssss";
        String s1="abacaba";
        System.out.println("No. of partitions: "+partitionString(s));
        ArrayList<String> t=new ArrayList<String>();
        t=partitionStringPrint(s);
        for(String e:t){
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("No. of partitions: "+partitionString(s1));
        ArrayList<String> t1=new ArrayList<String>();
        t1=partitionStringPrint(s1);
        for(String e:t1){
            System.out.print(e+" ");
        }
    }
}
