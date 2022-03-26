package com.company.searching;

public class Binary_Search_Iteration {
    public static void main(String[] args) {
        int[] arr={-1,2,3,4,5};
        int k=2;

        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k) {
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>k) high=mid-1;
            else low=mid+1;
        }
    }
}
