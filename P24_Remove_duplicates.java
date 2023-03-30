package com.exchange;

public class P24_Remove_duplicates {
    //Remove duplicates in a string
    static void remove_duplicate(String str,int i,StringBuilder newstr,boolean map[]){
        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(i);
        if(map[currchar-'a']==true){
            remove_duplicate(str, i+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            remove_duplicate(str, i+1, newstr.append(currchar), map);
        }
        
    }
    public static void main(String[] args) {
        String str="abacbcadbd";
        remove_duplicate(str, 0,new StringBuilder(""),new boolean[26]);
    }
}