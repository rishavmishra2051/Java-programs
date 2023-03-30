package com.exchange;

import java.util.ArrayList;

public class C25_DiceBoard {
    static ArrayList<String>getAllPossibilities(int start,int end){
        if(start==end){
            ArrayList<String>list=new ArrayList<>();
            list.add("");
            return list;
        }
        if(start>end){
            ArrayList<String>list=new ArrayList<>();
            return list;
        }
        ArrayList<String> finalresult=new ArrayList<String>();
        for(int dice=1;dice<=6;dice++){
            ArrayList<String> r= getAllPossibilities(start+dice, end);
            for(int i=0;i<r.size();i++){
                finalresult.add(r.get(i)+dice);
            }
        }
        return finalresult;
    }
    public static void main(String[] args) {
        ArrayList<String> result = getAllPossibilities( 0, 10);
        for(String e:result){
            System.out.print(e+" ");
        }
    }
}
