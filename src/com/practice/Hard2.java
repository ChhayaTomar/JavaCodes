package com.practice;

public class Hard2 {
    public static void main(String[] args) {
        int[] arr={8,1,3,2,4,6,5,9};
        int p=12;

        int n=arr.length;
//        for(int i=0;i<n-2;i+=3){
//            for(int j=i+1;j<n-1;j++){
//                for (int k = j+1; k < n; k++) {
//                    if((arr[i] + arr[j] + arr[k])==p){
//                        System.out.println(i + " " + j + " " + k);
//                    }
//                }
//            }
//        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j) {
                    for (int k = j+1; k < n; k++) {
                        if(i!=k && j!=k) {
                            if ((arr[i] + arr[j] + arr[k]) == p) {
                                System.out.println(i + " " + j + " " + k);
                            }
                        }
                    }
                }
            }
        }

    }
}
