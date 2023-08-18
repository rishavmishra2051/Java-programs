package com.exchange;
import java.util.HashMap;
public class P95_HashMap_Operation {
    public static void main(String[] args) {
        //Create
        HashMap<String,Integer>hm=new HashMap<>();
        //put operation Time complexity O(1)
        hm.put("India", 100);
        hm.put("USA", 50);
        hm.put("Russia", 70);
        System.out.println(hm);
        //get operation Time complexity O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));
        //containsKey Time complexity O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));
        //remove operation
        System.out.println(hm.remove("USA"));
        System.out.println(hm);
        //size
        System.out.println(hm.size());
        //IsEmpty
        System.out.println(hm.isEmpty());
        //clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}
