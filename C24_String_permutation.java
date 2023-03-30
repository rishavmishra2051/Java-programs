package com.exchange;
import java.util.ArrayList;

public class C24_String_permutation {
    static ArrayList<String> String_permutation(String str){
        if(str.length()==0){
            ArrayList<String>list= new ArrayList<String>();
            list.add("");
            return list;
        }else{
            char firstchar=str.charAt(0);
            String remString=str.substring(1);
            ArrayList<String> finalresult=new ArrayList<String>();
            ArrayList<String> r= String_permutation(remString);
            
            for(int i=0;i<r.size();i++){
                String val=r.get(i);
                for(int j=0;j<=val.length();j++){
                    StringBuilder sb = new StringBuilder(val);
                    sb.insert(j, firstchar);
                    finalresult.add(sb.toString());
                }
            }
            return finalresult;
            
        }
    }
    public static void main(String[] args) {
        String str="abc";
        ArrayList<String> t=new ArrayList<String>();
        t=String_permutation(str);
        for(String e:t){
            System.out.print(e+" ");
        }
    }
}
