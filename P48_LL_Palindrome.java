package com.exchange;

public class P48_LL_Palindrome extends P46_Linkedlist {
    
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;  //slow is middle node
    }
    public boolean checkPalindrome(){
        if (head==null||head.next==null) {
            return true;
        }
        //Step1 - Find mid
        Node midNode=findMid(head);
        //Step2 - Reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
        }
        Node right=prev;  //right half head
        Node left=head;
        //Step3 - Check left half & right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        P48_LL_Palindrome ll=new P48_LL_Palindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll.checkPalindrome());
    }
}
