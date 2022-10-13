package com.dp;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-04-01 12:20
 * @Description
 * @Result
 */
public class DataTower03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[][] dp = new int[len][len];
        int[][] arr = new int[len][len];
        int[] path = new int[len];
        //自顶向下输入
        for(int i=0;i<len;i++) {
            for(int j=0;j<=i;j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //dp数组赋值
        for(int i=0;i<len;i++) {
            dp[len-1][i] = arr[len-1][i];
        }
        //求最大路径和and最大路径
        for(int i=len-2;i>=0;i--) {
            for(int j=0;j<=i;j++) {
                dp[i][j] = arr[i][j]+Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        for(int i=0;i<len-1;i++) {
            for(int j=0;j<=i;j++) {

            }
        }
        System.out.println("最小路径和："+dp[0][0]);
        /*for(int i=0;i<len;i++) {	//输出路径的坐标
        	System.out.println(i+" "+path[i]);
        }*/
        //输出路径上的值
        for(int i=0;i<len;i++) {
            System.out.println("第"+i+"层:"+arr[i][path[i]]);
        }
    }
}
