package com.蓝桥云课;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-12 17:41
 * @Description
 */
public class 青蛙过河 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        int[] arr = new int[n];
        String[] strs = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

    }
}
