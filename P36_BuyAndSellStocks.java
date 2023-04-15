package com.exchange;

public class P36_BuyAndSellStocks {
    public static int maxProfit(int[] prices) {
        int n=prices.length,maxprofit=Integer.MIN_VALUE;
        int prefix[]=new int[n];
        prefix[0]=prices[0];
        for(int i=1;i<n;i++){
            prefix[i]=Math.min(prefix[i-1],prices[i]);
        }
        for (int i=0;i<n;i++){
            if ((prices[i]-prefix[i])>maxprofit){
                maxprofit=prices[i]-prefix[i];
            }
        }
        if(maxprofit<0){
            return 0;
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
