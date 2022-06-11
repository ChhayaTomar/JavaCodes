package com.company.dp;

//top-down then bottom-up
public class Knapsack_01_tabularization {
    public static void main(String[] args) {
        int w=5;
        int[] wt={4,5,1};
        int[] val={1,2,3};
        int n=wt.length;
        int[][] dp=new int[n+1][w+1];

        //System.out.println(Arrays.toString(dp));
        System.out.println(knapsack(n,w,wt,val,dp));
    }

    private static int knapsack(int n, int w, int[] wt, int[] val, int[][] dp) {
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j <w+1 ; j++) {
                if(j>=wt[i-1]){
                    dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-wt[i-1]] + val[i-1]);
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][w];

    }


}
