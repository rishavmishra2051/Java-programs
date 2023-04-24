package com.exchange;
//Floyd Cycle finding algorithm
public class P51_DetectAndRemoveCycleInLL extends P46_Linkedlist {
    public static boolean findCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){     //Cycle
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        //Detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){     //Cycle
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //Find meeting point
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        //Remove cycle -> last.next=null
        prev.next=null;
    }
    public static void main(String[] args) {
        P51_DetectAndRemoveCycleInLL ll=new P51_DetectAndRemoveCycleInLL();
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(findCycle());
        removeCycle();
        System.out.println(findCycle());
    }
}
