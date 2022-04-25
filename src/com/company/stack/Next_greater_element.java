package com.company.stack;

import java.util.Arrays;
import java.util.Stack;

public class Next_greater_element {
    public static void main(String[] args) {
        int[] arr={7,3,4,8,1};
        int[] res = nextGreater(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] nextGreater(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        int ci=1;

        while(ci<n){
            while(!stack.isEmpty() && arr[stack.peek()]<arr[ci]){
                res[stack.pop()]=arr[ci];
            }
            stack.push(ci);
            ci++;
        }
        while(!stack.isEmpty()){
            res[stack.pop()]=-1;
        }
        return res;
    }
}
