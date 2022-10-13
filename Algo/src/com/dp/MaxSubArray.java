package com.dp;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-25 11:23
 * @Description
 * @Result
 */
public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数组长度:");
        int len = sc.nextInt();
        System.out.println("数组元素（空格间隔）:");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
    private static int maxSubArray(int[] arr) {
        int len = arr.length;
        int[] dp = new int[len];
        dp[0] = arr[0];
        //求每个阶段的最优值
        for(int i=1;i<len;i++) {
            if(dp[i-1]>0) {
                dp[i] = dp[i-1]+arr[i];
            } else {
                dp[i] = arr[i]; //重新开始计算
            }
        }
        int res = dp[0];
        for(int i=1;i<len;i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
