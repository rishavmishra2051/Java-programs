package com.exchange;
import java.util.LinkedList;;
public class P53_MergeSortOnLL extends P46_Linkedlist{
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;  //slow is middle node
    }
    public Node mergeSort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        //Find mid
        Node mid=findMid(head);
        //Left & right Merge sort
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //Merge
        return merge(newLeft,newRight);
    }
    private Node merge(Node head1,Node head2){
        Node mergedLL=new Node(-1);
        Node temp=mergedLL;
        while(head1!=null&&head2!=null){
            if (head1.data<=head2.data) {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
            while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        return mergedLL.next;
    }
    public static void main(String[] args) {
        P53_MergeSortOnLL ll=new P53_MergeSortOnLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();
        ll.head=ll.mergeSort(ll.head);
        ll.print();
    }
}
