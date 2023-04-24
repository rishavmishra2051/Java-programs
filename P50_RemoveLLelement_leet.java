package com.exchange;
//Remove all the nodes of the linked list that has Node.data == val
public class P50_RemoveLLelement_leet extends P46_Linkedlist {
    public Node removeElements(Node head, int val) {
        Node temp=head;
        int i=0;
        while (temp!=null){
            if (temp.data==val){
                removeNthFromEnd(size-i);
            }
            i++;
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        P50_RemoveLLelement_leet ll=new P50_RemoveLLelement_leet();
        ll.addFirst(6);ll.addFirst(5);ll.addFirst(6);ll.addFirst(4);ll.addFirst(3);ll.addFirst(6);
        ll.addFirst(6);ll.addFirst(2);ll.addFirst(1);
        ll.print();
        ll.removeElements(head,6);
        ll.print();
    }
}
