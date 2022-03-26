package com.company.array1D;

import java.util.Arrays;
import java.util.Scanner;

public class Arranging_students {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t ; i++) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] arr2=new int[n];
            for (int j = 0; j <n ; j++) {
                arr[i]=sc.nextInt();
                arr2[i]=arr[i];
            }
            Arrays.sort(arr2);
            int count=0;
            for (int j = 0; j < n; j++) {
                if(arr[j] !=arr2[j]){
                   count++;
                }
            }
            if(count>2){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
//            int[] arr=new int[n];
//            int count=0;
//            for (int j = 0; j <n ; j++) {
//                arr[i]=sc.nextInt();
//                if(arr[i] != i+1){
//                    count++;
//                }
//            }
//            if(count==2){
//                System.out.println("YES");
//            }else{
//                System.out.println("NO");
//            }
        }
    }
}
