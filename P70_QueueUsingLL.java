package com.exchange;

public class P70_QueueUsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class QueueLL{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null&&tail==null;
        }
        //Add
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        //Remove
        public static int remove() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;           }
            else{
                head=head.next;
            }
            return front;
        }
        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return-1;
            }
            return head.data;
        }
        public static void printQueue(QueueLL q){
            while(!q.isEmpty()){
                System.out.print(q.peek()+" ");
                q.remove();
            }
        }
    }

    public static void main(String[] args) {
        QueueLL q=new QueueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);
        q.printQueue(q);
    }
}
