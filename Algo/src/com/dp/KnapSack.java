package com.dp;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-03-31 15:38
 * @Description	2 6 2 3 6 5 5 4 4 6
 * @Result
 */
public class KnapSack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入背包容量：");
        int bagWeight = sc.nextInt();
        System.out.println("请输入物品数量：");
        int nums = sc.nextInt();
        System.out.println("请输入物品重量和物品价值（重量和价值之间空格隔开，" +
                "每个物品之间空格或回车隔开）：");
        int[] weight = new int[nums];
        int[] value = new int[nums];
        for(int i=0;i<nums;i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }
        System.out.println(getMaxValue(weight,value,bagWeight));
    }
    //  0/1背包
    private static int getMaxValue(int[] weight,int[] value,int bagweight){
        //定义dp数组   表示从0~i的物品中任意取，放进价值为j的背包中的最大价值
        int[][] dp = new int[weight.length][bagweight+1];
        //dp数组初始化   第一行初始化为第一个物品放进背包的价值
        for(int j=weight[0];j<=bagweight;j++) {
            dp[0][j] = value[0];
        }
        //遍历物品 第一个物品在dp数组初始化的时候已经放入计算过了
        for(int i=1;i<weight.length;i++) {
            //遍历背包容量 背包容量为0的时候已经被计算了
            for(int j=1;j<=bagweight;j++) {
                if (j<weight[i]) {  //当前背包容量放不下物品i
                    dp[i][j] = dp[i-1][j];
                } else {            //当前背包容量可以放下物品i，判断放下最优还是原来的更优
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
                }
            }
        }
        //回溯求装入背包的物品
        int[] goods = new int[value.length];
        for(int j=bagweight,i=goods.length-1;i>0;i--) {
            if(dp[i][j]>dp[i-1][j]) {
                goods[i] = 1;
                j = j-weight[i];
            } else {
                goods[i] = 0;
            }
            //对第一个物品是否放入背包进行特判
            if(i-1==0&&dp[i-1][j]!=dp[i][j]) {
                goods[0]=1;
            }
        }

        //打印装入背包的物品
        System.out.println(Arrays.toString(goods));
        //返回dp数组右下角的值，最优结果
        return dp[weight.length-1][bagweight];
    }
}
