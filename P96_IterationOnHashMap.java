package com.exchange;
import java.util.*;
public class P96_IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 50);
        hm.put("Russia", 70);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);
        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("Key = "+k+", value = "+hm.get(k));
        }
    }
}
