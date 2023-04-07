package com.第十四届模拟;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-03 14:32
 * @Description
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[32][62];
        int[][] dp = new int[32][62];
        for (int i=1; i<31; i++) {
            String[] strs = sc.nextLine().split("");
            for (int j=0; j<strs.length; j++) {
                arr[i][j+1] = Integer.parseInt(strs[j]);
            }
        }

        dp[1][1] = arr[1][1];
        for (int i=1; i<31; i++) {
            for (int j=1; j<61;j++) {
                //当前值右方大于左方，往右走
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) + arr[i][j];
            }
        }
        System.out.println(dp[30][60]);
        System.out.println("--------------");
    }
}
