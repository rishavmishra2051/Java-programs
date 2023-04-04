package com.exchange;

import java.util.ArrayList;

public class C26_BoardPath {
    static ArrayList<String> boardPath(int startrow,int startcolumn,int endrow,int endcolumn){
        if(startrow==endrow && startcolumn==endcolumn){
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }
        if(startrow>endrow||startcolumn>endcolumn){
            ArrayList<String> list=new ArrayList<>();
            return list;
        }
        ArrayList<String> finallist=new ArrayList<>();
        //move to right
        ArrayList<String> templist=boardPath(startrow, startcolumn+1, endrow, endcolumn);
        for(String t:templist){
            finallist.add(t+"R");
        }
        //move to down
        templist=boardPath(startrow+1, startcolumn, endrow, endcolumn);
        for(String t:templist){
            finallist.add(t+"B");
        }
        //move to diagonal
        templist=boardPath(startrow+1, startcolumn+1, endrow, endcolumn);
        for(String t:templist){
            finallist.add(t+"D");
        }
        return finallist;
    }
    public static void main(String[] args) {
        ArrayList<String> t=boardPath(0, 0, 2, 2);
        for(String e:t){
            System.out.print(e+" ");
        }
    }
}
