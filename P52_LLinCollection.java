package com.exchange;
import java.util.LinkedList;
public class P52_LLinCollection {
    public static void main(String[] args) {
        //Create - objects int, float, boolean -> Integer, Float, Character 
        LinkedList<Integer> ll=new LinkedList<>();
        //Add elements
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        System.out.println(ll);
        //Remove elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
