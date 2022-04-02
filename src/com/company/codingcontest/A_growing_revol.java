package com.company.codingcontest;

import java.util.Scanner;

public class A_growing_revol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        String str=sc.next();
        int countN=0;
        int countT=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='N') countN+=1;
            else countT+=1;
        }
        if(countN>countT) System.out.println("Nutan");
        else System.out.println("Tusia");
    }
}
