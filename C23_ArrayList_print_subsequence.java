package com.exchange;

import java.util.ArrayList;

public class C23_ArrayList_print_subsequence {
    static ArrayList<String> subsequence(String str){
        if(str.length()==0){
            ArrayList<String>list= new ArrayList<String>();
            list.add("");
            return list;
        }else{
            //Get the first character
            char firstchar=str.charAt(0);
            //Make the string small
            String remString=str.substring(1);
            ArrayList<String> finalresult=new ArrayList<String>();
            //Do the recursion
            ArrayList<String> r= subsequence(remString);
            for(int i=0;i<r.size();i++){
                String val=r.get(i);
                finalresult.add(val);
                finalresult.add(firstchar+val);
            }
            return finalresult;
            
        }
    }
    public static void main(String[] args) {
        String str="amit";
        ArrayList<String> t=new ArrayList<String>();
        t=subsequence(str);
        for(String e:t){
            System.out.print(e+" ");
        }
        
    }
}
