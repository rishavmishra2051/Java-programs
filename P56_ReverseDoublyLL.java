package com.exchange;

public class P56_ReverseDoublyLL extends P55_DoublyLL{
    public void reverseDLL(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        P56_ReverseDoublyLL dll=new P56_ReverseDoublyLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.reverseDLL();
        dll.print();
    }
}
