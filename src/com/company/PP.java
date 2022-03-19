package com.company;

public class PP {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] freq={1,2,2,2,2};
        String str="";
        for (int i = 0; i <freq.length ; i++) {
            int m=freq[i];
            for(int j=0;j<m;j++){
                str+=arr[i];
            }
        }
        System.out.println(str);
        long res=(Long.parseLong(str))%11;
        System.out.println(res);
        int res2=(int)res;
        System.out.println(res2);
    }
}
