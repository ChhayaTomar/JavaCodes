package com.practice;

import java.util.Arrays;

public class Hard1 {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] res = merge(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(res));
    }

    public static int[] merge(int[] arr, int start, int end) {
        if (start == end) {
            int[] res = new int[1];
            res[0] = arr[start];
            return res;
        }
        int mid = (start + end) / 2;
        int[] lArr = merge(arr, start, mid);
        int[] rArr = merge(arr, mid + 1, end);
        return mergeTwoSortedArr(lArr, rArr);
    }

    public static int[] mergeTwoSortedArr(int[] lArr, int[] rArr) {
        int[] newArr = new int[lArr.length + rArr.length];
        int i = 0, j = 0;

        for (int k = 0; k <newArr.length ; k++) {
            if(i!= lArr.length && j!= rArr.length){
                newArr[k]=(lArr[i]<rArr[j]) ? lArr[i++] : rArr[j++];
            }else if(i!= lArr.length){
                newArr[k]=lArr[i++];
            }else{
                newArr[k]=rArr[j++];
            }
        }
        return newArr;
    }
}
