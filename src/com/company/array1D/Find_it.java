package com.company.array1D;

import java.util.Scanner;

public class Find_it {
        public static void main (String[] args) {
            // Your code here
            Scanner sc=new Scanner(System.in);
            long K=sc.nextLong();
            System.out.println(Find(K));
        }

    public static long Find(long K){
        for(long i=1;i<Math.sqrt(K);i++){
            if((i*i)+(3*i)==K)
                return i;
        }
        return -1;
        }
    }
