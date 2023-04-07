package com.第一届初赛;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-17 20:36
 * @Description
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i=0; i<N-2; i++) {
            if (helper(arr[i]) && helper(arr[i+1]) && helper(arr[i+2])) {
                count++;
            }
        }
        System.out.print(count);
    }
    private static boolean helper(int n) {
        for (int i=2; i<n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}
