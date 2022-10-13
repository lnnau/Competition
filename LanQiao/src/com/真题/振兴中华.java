package com.真题;

/**
 * 动态规划
 * 4*5的矩阵
 *
 * 35
 */
public class 振兴中华 {
    public static void main(String[] args) {
        int[][] dp = new int[5][6];
        dp[1][1]=1;
        for(int i=1;i<=4;i++) {
            for(int j=1;j<=5;j++) {
                //加一个判断，避免起始值被覆盖掉
                if(i+j!=2)
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        System.out.println(dp[4][5]);
    }
}
