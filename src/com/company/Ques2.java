package com.company;

import java.util.Arrays;

public class Ques2 {
    public static void main(String[] args) {
        int n=7;
        System.out.println(fibWithRecurstion(n));
//        int[] dp=new int[n+1];
//        Arrays.fill(dp,-1);
        System.out.println(fibEWithDp(n));
    }

    public static int fibWithRecurstion(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibWithRecurstion(n-1) + fibWithRecurstion(n-2);
    }

    public static int fibEWithDp(int n){
//        if(n==0) return 0;
//        if(n==1) return 1;
//        if(dp[n]!=-1) return dp[n];
//        dp[n]=fibWithRecurstion(n-1)+fibWithRecurstion(n-2);
//
//        return dp[n];

        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
