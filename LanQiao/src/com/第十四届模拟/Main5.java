package com.第十四届模拟;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-03 15:48
 * @Description
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[310];   //最大为306
        int[][] dp = new int[2050][2050];
        int count = 0;
        //求出所有质数
        for (int i=2; i<n; i++) {
            if (helper(i)) {
                arr[count++] = i;
            }
        }
       //dp数组初始化
        for (int i=0; i<=2022; i++) {
            dp[0][i] =arr[0];
        }
        for (int i=1; i<count; i++) {
            for (int j=1; j<=2022; j++) {
                if (j < arr[i]) {
                    dp[i][j] = dp[i][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-arr[i]]+1);
                }
            }
        }
        System.out.println(dp[count-1][2022]);

    }
    private static Boolean helper(int num) {
        for (int i=2; i<num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
