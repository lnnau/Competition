package LOQ.递推与递归;

import java.util.Scanner;

/**
 * 动态规划
 * 起始位置只有一种路径，下一次走的位置的方法是由上一次所组成的，最终问题的解是由前面的解所构成
 * 1.输入：B坐标和马的坐标
 * 2.输出：从A到B的总路径数
 * 算法
 * //对马能到达的位置做上标记,包括马自身的位置
 * dp[i][j]=-1
 * res[2][2]=-1
 * for i ← 2 to n do
 *  for j ← 2 to m do
 *      res[i][j]=res[i-1][j]+res[i][j-1];
 */
public class P1002过河卒 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //防止出现越界，将坐标都向右下角平移一个单位
        int n = sc.nextInt() + 2, m = sc.nextInt() + 2, b1 = sc.nextInt() + 2, b2 = sc.nextInt() + 2;
        //定义二维坐标系 n+1为了包括n
        int[][] dp = new int[n + 1][m + 1];
        long[][] res = new long[n + 1][n + 1];
        //将马能到达的位置做上标记，包括马的位置
        dp[b1][b2] = -1;
        dp[b1 + 2][b2 + 1] = -1;
        dp[b1 + 1][b2 + 2] = -1;
        dp[b1 - 1][b2 - 2] = -1;
        dp[b1 - 2][b2 - 1] = -1;
        dp[b1 - 1][b2 + 2] = -1;
        dp[b1 - 2][b2 + 1] = -1;
        dp[b1 + 2][b2 - 1] = -1;
        dp[b1 + 1][b2 - 2] = -1;
        dp[2][2] = -1;
        //起点值为2
        res[2][2] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                //马可以到达 将结果集赋值
                if (dp[i][j] == 0) {
                    res[i][j] = res[i - 1][j] + res[i][j - 1];
                }
            }
        }
        System.out.println(res[n][m]);
    }
}
