package com.exchange;
import java.util.*;
public class P71_Queue {
    public static void main(String[] args) {
        Queue <Integer> q=new LinkedList<>();
        //Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
