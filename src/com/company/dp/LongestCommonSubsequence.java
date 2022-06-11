package com.company.dp;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1="ABXDCY";
        String str2="YATBC";

        int[][] dp=new int[str1.length()+1][str2.length()+1];
        String str3="";

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    //str3=str3+str1.charAt(i-1);
                }else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[str1.length()][str2.length()]);
        System.out.println(str3);
    }
}
