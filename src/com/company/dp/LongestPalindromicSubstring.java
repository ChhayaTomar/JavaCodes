package com.company.dp;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String str="DABABC";
        boolean[][] dp=new boolean[str.length()][str.length()];
        String s="";

        for (int gap = 0; gap <str.length() ; gap++) {
            for (int i=0,j=gap;j<str.length();i++,j++) {
                if(gap==0){
                    dp[i][j]=true;
                }else if(gap==1){
                    dp[i][j]= str.charAt(i)==str.charAt(j);
                }else{
                    if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]){
                        dp[i][j]=true;
                    }
                }
                if(dp[i][j]){
                    s=str.substring(i,j+1);
                }
            }
        }
        System.out.println(s);
    }
}
