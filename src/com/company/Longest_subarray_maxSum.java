package com.company;

public class Longest_subarray_maxSum {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubArr(arr));
    }
    public static int maxSubArr(int[] arr){
        int n=arr.length;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int left=0;
        int right=0;

        for (int i = 0; i <n ; i++) {
            currSum+=arr[i];
            if(currSum<arr[i]){
                currSum=arr[i];
                left=i;
            }
            if(maxSum<currSum){
                maxSum=currSum;
                right=i;
            }
        }
        System.out.println(left + " " + right);
        return maxSum;
    }
}
