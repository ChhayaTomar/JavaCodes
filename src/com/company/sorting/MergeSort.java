package com.company.sorting;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MergeSort {
    public static int[] sort(int[] arr, int start, int end) {
        if (start == end) {
            int[] res = new int[1];
            res[0] = arr[start];
            return res;
        } else {
            int mid = (start + end) / 2;
            int[] lArr = sort(arr, start, mid);
            int[] rArr = sort(arr, mid + 1, end);
            return mergeTwoSortedArray(lArr, rArr);
        }
    }

    public static int[] mergeTwoSortedArray(int[] lArr, int[] rArr) {
        int i = 0;
        int j = 0;
        int[] result = new int[lArr.length + rArr.length];

        for (int k = 0; k < result.length; k++) {
            if (i != lArr.length && j != rArr.length) {
                result[k] = (lArr[i] < rArr[j]) ? lArr[i++] : rArr[j++];
            } else if (i != lArr.length) {
                result[k] = lArr[i++];
            } else {
                result[k] = rArr[j++];
            }
        }
        return result;
    }

    public static void printArray(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = sort(arr, 0, n - 1);
        printArray(result);
    }
}
