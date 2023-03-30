package com.exchange;

public class P19_Shortestpath {
    static float shortestpath(String s){
        int x=0,y=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'N':{
                    y++;
                    break;
                }
                case 'S':{
                    y--;
                    break;
                }
                case 'E':{
                    x++;
                    break;
                }
                case 'W':{
                    x--;
                    break;
                }
            }
        } 
        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static void main(String[] args) {
        String s="WNEENESENNN";
        System.out.println(shortestpath(s));
    }
}
