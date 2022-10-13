package com.dp;
import java.util.*;
public class DataTower02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("请输入数塔层数：");
		int len = sc.nextInt();
	    int[][] dp = new int[len][len];
	    int[][] arr = new int[len][len];
	    int[][] path = new int[len][len];
        System.out.println("请输入数塔元素（中间空格隔开）：");
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
				//当前层元素的下一层左和右更小的赋值给当前层元素
				if(dp[i+1][j]<dp[i+1][j+1]) {
					dp[i][j] = dp[i+1][j] + arr[i][j];
					path[i][j]=j;	//本次决策选择下标为j的元素
				} else {
					dp[i][j] = dp[i+1][j+1] + arr[i][j];
					path[i][j]=j+1;	//本次决策选择下标为j+1的元素
				}
        	}
        }
        System.out.println("最小路径和："+dp[0][0]);
		//输出路径上的值
		int tp = path[0][0];	//顶层记录的是下一层的走向
		System.out.println("第0层:"+arr[0][0]);
		for(int i=1;i<len;i++) {
			System.out.println("第"+i+"层:"+arr[i][tp]);
			tp=path[i][tp];
		}
	}
}
