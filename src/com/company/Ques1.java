package com.company;

import java.util.Arrays;

public class Ques1 {
    public static void main(String[] args) {
        int[] coins={2,3,5};
        int amount=17;
        //int[] dp=new int[amount+1];
//        Arrays.fill(dp,-1);
//        dp[0]=0;
        System.out.println(coinChange(coins, amount));

    }
    public static int coinChange(int[] coins, int amount){
        if(amount==0) return 0;
        int[] t= new int[amount+1];
        mininumCoin(coins,amount,t);
        return t[amount]>=1000 ? -1 : t[amount];
    }
    public static int mininumCoin(int[] coins, int amount, int[] t){
        int minCoin=1001;
        if(t[amount]!=0) return t[amount];

        for(int j=0;j<coins.length;j++){
            if(amount==coins[j]) return t[amount]=1;
            if(amount<coins[j]) continue;
            minCoin=Math.min(minCoin, 1+mininumCoin(coins,amount-coins[j],t));
        }
        return t[amount]=minCoin;
    }
}
