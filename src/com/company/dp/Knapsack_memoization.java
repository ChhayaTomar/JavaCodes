package com.company.dp;

//bottom-up
public class Knapsack_memoization {
    public static void main(String[] args) {
        int w=3;
        int[] wt={4,5,6};
        int[] val={1,2,3};
        int n=wt.length;
        int[][] dp=new int[n+1][w+1];
        for (int i = 0; i <dp.length ; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j]=-1;
            }
        }
        System.out.println(knapsack(n,w,wt,val,dp));
    }
    private static int knapsack(int n, int w, int[] wt, int[] val, int[][] dp) {
        if(n==0 || w==0) return 0;
        if(dp[n][w]!=-1){
            return dp[n][w];
        }
        if(wt[n-1]<=w){
            dp[n][w]=Math.max((val[n-1]+knapsack(n-1,w-wt[n-1],wt,val,dp)), knapsack(n-1,w-wt[n-1],wt,val,dp));
        }else{
            dp[n][w]=knapsack(n-1,w,wt,val,dp);
        }
        return dp[n][w];
    }

}
