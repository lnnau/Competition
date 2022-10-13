package com.基础;

public class Test1 {
    public static void main(String[] args) {
        long[] arr = new long[100000000];
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;
        for(int i=4;i<=20190324;i++) {
            arr[i]=(arr[i-1]+arr[i-2]+arr[i-3])%10000;
        }
        System.out.println(arr[20190324]);
    }
}
