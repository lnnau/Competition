package com.去年决赛;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        // 1（第一个数）到K部分执行从小到大排序
        Arrays.sort(arr, 0, k);
        // K+1到N部分执行从大到小排序
        Arrays.sort(arr, k, n, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return (int) (o2 - o1);
            }
        });
        // 第一段的中间
        int index1 = (k + 1) / 2;
        Arrays.sort(arr, index1, k, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return (int) (o2 - o1);
            }
        });
        // 第二段的中间
        int index2 = k + (n - k + 1) / 2;
        Arrays.sort(arr, k, index2);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if(i < n - 1) {
                System.out.print(" ");
            } else {
                // 题目要求 所有数据输出后换行
                System.out.println();
            }
        }
    }
}
