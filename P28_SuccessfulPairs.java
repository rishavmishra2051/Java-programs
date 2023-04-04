package com.exchange;

public class P28_SuccessfulPairs {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] temp=new int[spells.length];
        for (int i=0;i< spells.length;i++){
            int count=0;
            for (int j=0;j< potions.length;j++){
                int prod=spells[i]*potions[j];
                if(prod>=success){
                    count++;
                }
            }
            temp[i]=count;
        }
        return temp;
    }
    public static void main(String[] args) {
        int spells[] = {3,1,2};
        int potions[] = {8,5,8};
        int success = 16;
        int a[]=successfulPairs(spells,potions,success);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
