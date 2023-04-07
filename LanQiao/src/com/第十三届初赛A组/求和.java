package com.第十三届初赛A组;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2023-04-07 12:57
 * @Description
 */
public class 求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(sumOfTwoSquares(arr));
    }
    public static int sumOfTwoSquares(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                sum += a[i] * a[j];
            }
        }
        return sum;
    }
}
