package com.dp;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-03-29 10:46
 * @Description
 * @Result 60
 */
public class DataTower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[][] dp = new int[len][len];
        //自顶向下输入
        for(int i=0;i<len;i++) {
            for(int j=0;j<=i;j++) {
                dp[i][j] = sc.nextInt();
            }
        }
        //自底向上求最优解
        for(int i=len-1;i>=0;i--) {
            for(int j=0;j<=i;j++) {
                if (i==len-1) continue; //最大层特殊处理
                else {  //递推公式
                    dp[i][j] = dp[i][j]+Math.max(dp[i+1][j],dp[i+1][j+1]);
                }
            }
        }
        //输出最优解
        System.out.println(dp[0][0]);
    }
}
