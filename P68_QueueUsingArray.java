package com.exchange;
//Time complexity for add O(1)
//Time complexity for remove O(n)
public class P68_QueueUsingArray {
    static class QueueArray{
        static int arr[];
        static int size;
        static int rear;
        QueueArray(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        //Add element
        public static void add(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        //Remove element
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return-1;
            }
            return arr[0];
        }
        //Print Queue
        public static void printQueue(QueueArray q){
            while(!q.isEmpty()){
                System.out.print(q.peek()+" ");
                q.remove();
            }
        }
    }
    public static void main(String[] args) {
        QueueArray q=new QueueArray(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.printQueue(q);
    }
}
