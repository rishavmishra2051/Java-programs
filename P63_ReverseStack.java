package com.exchange;
import java.util.*;
public class P63_ReverseStack {
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottomOfStack(s, top);
    }
    public static void pushAtBottomOfStack(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=(int)s.pop();
        pushAtBottomOfStack(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        reverseStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
