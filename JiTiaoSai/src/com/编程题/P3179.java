package com.编程题;

import java.util.Scanner;

public class P3179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(),M=sc.nextInt();
        int count=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++) {
            for(int j=i+1;j<N;j++) {
                if(arr[i]+arr[j]==M) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
