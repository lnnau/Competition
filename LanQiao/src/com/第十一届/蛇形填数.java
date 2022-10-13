package com.第十一届;

import java.util.Arrays;

/**
 * @Author Lunau
 * @Create 2022-03-21 14:59
 * @Description
 * n行n列的值是其第2n-1层，而且其值为该层的中间值
 * 那么20行20列的值就是39层的中间值（39-1）/2+1,第19个值也就是761
 * @Result  761
 */
public class 蛇形填数 {
    public static void main(String[] args) {
        //定义数组存放数据
        int[][] arr = new int[40][40];
        int count=1;
        //控制层数
        for(int i=1;i<arr.length;i++) {
            //控制每层的个数
            for(int j=1;j<=i;j++) {
                //奇数层从左往右加
                if(i%2==1) {
                    arr[i][j]=count;
                    count++;
                } else {
                    //偶数成从右往左加
                    arr[i][i-j+1]=count;
                    count++;
                }
            }
        }
        for(int i=1;i<arr.length;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
