package com.exchange;
//No. of nodes in the longest path between 2 leaves
//Time complexity O(n^2)
import java.util.*;
import java.lang.Math;
public class P91_DiameterOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh, rh)+1;
    }
    public static int diameterOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftDiameter=diameterOfTree(root.left);
        int lh=height(root.left); 
        int rightDiameter=diameterOfTree(root.right);
        int rh=height(root.right);
        int selfdiameter=lh+rh+1;
        return Math.max(selfdiameter,Math.max(rightDiameter, selfdiameter));
    }
    //Approach 2
    static class Info{
        int diam;
        int ht;
        public Info(int diam,int ht){
            this.diam=diam;
            this.ht=ht;
        }
    }
    public static Info diameter(Node root){//O(n)
        if(root==null){
            return new Info(0, 0);
        }
        Info leftInfo=diameter(root.left);
        Info rightInfo=diameter(root.right);
        int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
        return new Info(diam, ht);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diameterOfTree(root));
        System.out.println("Approach 2");
        System.out.println(diameter (root).diam);
    }
}
