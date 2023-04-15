package com.exchange;

public class P46_Linkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //Add elements in linked list
    public void addFirst(int data){
        //Step1-Create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        return;
        }
        //Step2-NewNode next=head
        newNode.next=head;//Link
        //Step3-head=newNode
        head=newNode;
    }
    public void addMiddle(int index,int data){
        if(index==0){
            addFirst(data);
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        //i=index-1; temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void addLast(int data){
        //Step1-Create new node
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        return;
        }
        //Step2-tail.next=newNode
        tail.next=newNode;
        //Step3-tail=newNode
        tail=newNode;
    }
    //Remove Elements from linked list
    public int removeFirst(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public void removeFirst1(){
        if(size==0){
            System.out.println("Linked list is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        head=head.next;
        size--;
    }
    public void removeMiddle(int index){
        if(size==0){
            System.out.println("Linked list is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        Node prev=head;
        for(int i=0;i<index-1;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        size--;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev:i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public void removeLast2(){
        if(size==0){
            System.out.println("Linked list is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;
            return;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;
        size--;
    }
    //Search elements from linked list
    public int iterativeSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head, key);
    }
    public void print(){
        if(head==null){
            System.out.println("Linked is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        P46_Linkedlist ll=new P46_Linkedlist();
        /*Creating new node
        ll.head=new Node(1);
        ll.head.next=new Node(2);*/
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addLast(6);
        ll.print();
        ll.addMiddle(2, 3);
        ll.print();
        ll.addMiddle(3, 4);
        ll.print();
        System.out.println("Element present at index: "+ll.iterativeSearch(4));
        System.out.println("Element present at index: "+ll.recursiveSearch(5));
        System.out.println("Size of Linked list: "+ll.size);
        ll.removeMiddle(3);
        ll.print();
        ll.removeMiddle(2);
        ll.print();
        ll.removeFirst();
        ll.print();;
        ll.removeFirst1();
        ll.print();
        ll.removeLast();
        ll.print();
        ll.removeLast2();
        ll.print();
        System.out.println("Size of Linked list: "+ll.size);
    }
}
