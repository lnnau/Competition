package com.去年决赛;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[12];
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        for(int i=2;i<12;i++) {
            if(String.valueOf(arr[i-1]*arr[i-2]).length()<=5)   //五位数以内才加入
            arr[i]=arr[i-1]*arr[i-2];
        }
        for(int i=2;i<12;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
