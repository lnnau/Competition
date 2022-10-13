package com.twenty;
/*
格子路径
1.动态规划
通过分析给出的案例可以得到n*n的网格中，从(0,0)到(n,n)需要走n+n步
也就是往右走n步往下走n步
2.排列组合
四十个中二十种往右走的方法数
 */
public class Exercise15 {
    public static void main(String[] args) {
        long[][] dp = new long[23][23]; //多留出两列用于解决数组越界
        //n*n的网格中有(n+1)*(n+1)个顶点
         for(int i=1;i<=21;i++) {
             for(int j=1;j<=21;j++) {
                 //起始点从(1,1)开始
                if(i==1 && i==1) {
                    dp[1][1]=1;
                }else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
             }
         }
        System.out.println(dp[21][21]);
    }
}
