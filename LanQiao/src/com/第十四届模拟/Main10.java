package com.第十四届模拟;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-03 17:28
 * @Description
 */
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (arr[i] > arr[j]) {
                    sum+=arr[i];
                    int tp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tp;
                }
            }
        }
        System.out.println(sum);
    }
}
