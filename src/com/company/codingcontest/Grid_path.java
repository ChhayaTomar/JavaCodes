package com.company.codingcontest;

import java.util.Scanner;

public class Grid_path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t ; i++) {
            int r=sc.nextInt();
            int c=sc.nextInt();
            int[][] arr=new int[r][c];
            for (int j = 0; j <r; j++) {
                for (int k = 0; k <c ; k++) {
                    arr[j][k]=sc.nextInt();
                }
            }
            if(r==c) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
