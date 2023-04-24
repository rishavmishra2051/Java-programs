package com.exchange;
/*Before ZigZag
 * 1->2->3->4->5->6->null
 * After ZigZag
 * 1->6->2->5->3->4->null
 */
public class P54_ZigZagLL extends P46_Linkedlist{
    public void zigZag(){
        //Find mid
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        //Reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
         }
         Node right=prev;  //right half head
        Node left=head;
        Node nextL,nextR;
        //Alternate merge -> ZigZag merge
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;
            right=nextR;
        }
    }
    public static void main(String[] args) {
        P54_ZigZagLL ll=new P54_ZigZagLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
