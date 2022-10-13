package com.dp;

import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-04-21 16:07
 * @Description
 * @Result
 */
public class CommonOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入序列1:");
        char[] ach = sc.nextLine().toCharArray();
        System.out.println("请输入序列2");
        char[] bch = sc.nextLine().toCharArray();
        System.out.println("最长公共序列长度为："+getCommonOrder(ach,bch));
    }
    public static int getCommonOrder(char[] ach,char[] bch) {
        //最长公共子序列数组 第一行第一列初始化为0
        int[][] dp = new int[ach.length+1][bch.length+1];
        //序列状态数组
        int[][] state = new int[ach.length+1][bch.length+1];
        for(int i=1;i<=ach.length;i++) {
            for(int j=1;j<=bch.length;j++) {
                //相等就在上一个基础上加一
                if(ach[i-1]==bch[j-1]) {
                    dp[i][j] = dp[i-1][j-1]+1;
                    state[i][j] = 1;    //dp[i][j]从左上方推出
                } else if(dp[i][j-1]>=dp[i-1][j]) {
                    //不相等就从dp[i-1][j]或dp[i][j-1]取较大者
                    dp[i][j] = dp[i][j-1];
                    state[i][j] = 2;    //dp[i][j]从左边推出
                } else{
                    dp[i][j] = dp[i-1][j];
                    state[i][j] = 3; //dp[i][j]从上方推出
                }
            }
        }

        //求最长公共序列,dp数组右下角为最长公共子序列长度
        int p=ach.length,q=bch.length,k=dp[p][q];
        char[] res = new char[k]; //防止越界
        while(p>0&&q>0) {
            if(state[p][q]==1) {
                res[k-1] = ach[p-1];  //ach最后一个索引是ach长度减一,res是从0开始索引
                k--;p--;q--;
            } else if(state[p][q]==2) {
                q--;    //bch指针左移
            } else {
                p--;    //ach指针左移动
            }
        }
        for(int i=0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        }
        return dp[ach.length][bch.length];
    }
}
