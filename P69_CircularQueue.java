package com.exchange;

public class P69_CircularQueue {
    static class CircularQueueUsingArray{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        CircularQueueUsingArray(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        //Add element
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //Add 1st element
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //Remove element
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result=arr[front];
            //Delete last element
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return-1;
            }
            return arr[front];
        }
        //Print Queue
        public static void printQueue(CircularQueueUsingArray q){
            while(!q.isEmpty()){
                System.out.print(q.peek()+" ");
                q.remove();
            }
        }
    }
    public static void main(String[] args) {
        CircularQueueUsingArray q=new CircularQueueUsingArray(3);
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
