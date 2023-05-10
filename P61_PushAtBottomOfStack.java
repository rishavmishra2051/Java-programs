package com.exchange;
//O(n)time
import java.util.*;
public class P61_PushAtBottomOfStack {
    static Stack<Integer> pushAtBottomOfStack(Stack<Integer> s,int data){
        if(s.isEmpty()){
            Stack<Integer> t=new Stack<>();
            t.push(data);
            return t;
        }
        int top=(int)s.pop();
        Stack <Integer> result= pushAtBottomOfStack(s,data);
        result.push(top);
        return result;
    }
    static void pushAtBottomOfStack_Approach2(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=(int)s.pop();
        pushAtBottomOfStack_Approach2(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        Stack <Integer> t= pushAtBottomOfStack(s, 5);
        while(!t.isEmpty()){
            System.out.println(t.peek());
            t.pop();
        }
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottomOfStack_Approach2(s, 6);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
