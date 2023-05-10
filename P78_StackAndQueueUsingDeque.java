package com.exchange;
import java.util.*;
public class P78_StackAndQueueUsingDeque {
    static class StackDeque{
        Deque<Integer>deque=new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }
    static class QueueDeque{
        Deque<Integer>deque=new LinkedList<>();
        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        StackDeque s=new StackDeque();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek "+s.peek());
        System.out.println("Pop "+s.pop());
        System.out.println("Pop "+s.pop());
        System.out.println("Pop "+s.pop());
        QueueDeque q=new QueueDeque();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek "+q.peek());
        System.out.println("Remove "+q.remove());
        System.out.println("Remove "+q.remove());
        System.out.println("Remove "+q.remove());
    }
}
