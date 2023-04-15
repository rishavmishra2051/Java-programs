package com.exchange;

public class P47_Reverse_A_Linkedlist {
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
    public void addFirst(int data){
        //Step1-Create new node
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        return;
        }
        //Step2-NewNode next=head
        newNode.next=head;//Link
        //Step3-head=newNode
        head=newNode;
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
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        P47_Reverse_A_Linkedlist ll=new P47_Reverse_A_Linkedlist();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.reverse();
        ll.print();
    }
}
