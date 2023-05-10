package com.exchange;
import java.util.*;
public class P76_QueueReversal {
    public static void queueReversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        queueReversal(q);
    }
}
