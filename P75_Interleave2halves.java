package com.exchange;
import java.util.*;
//Input: 12345678910
//Output: 16273849510
public class P75_Interleave2halves {
    public static void interleave(Queue<Integer> q){
        int size=q.size();
        Queue<Integer>firsthalf=new LinkedList<>();
        for(int i=0;i<size/2;i++){
            firsthalf.add(q.remove());
        }
        while(!firsthalf.isEmpty()){
            q.add(firsthalf.remove());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        interleave(q);
    }
}
