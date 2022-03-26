package com.company.array1D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Disappearing_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        disappearedNums(arr,n);
    }
    public static void disappearedNums(int[] arr, int n){
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        HashMap<Integer, Integer> hmap=new HashMap<>();
        for(int i:arr)
        {
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int i=0; i<arr.length; i++) {
            if(!hmap.containsKey(i+1)) {
                count+=1;
                System.out.print(i + 1 + " ");
            }
        }
        if(count==0){
            System.out.println(" ");
        }
    }
}
