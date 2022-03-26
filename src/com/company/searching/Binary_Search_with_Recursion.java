package com.company.searching;

public class Binary_Search_with_Recursion {
    public static int binarySearch(int[] arr, int t, int l, int r){
        if(l>r) return -1;
        int  mid=(l+r)/2;
        if(arr[mid]==t) return mid;
        else if(arr[mid]>t) return binarySearch(arr,t,l,mid-1);
        else return binarySearch(arr,t,mid+1,r);
    }
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int k=9;
        System.out.println(binarySearch(arr, k, 0, arr.length-1));
    }
}
