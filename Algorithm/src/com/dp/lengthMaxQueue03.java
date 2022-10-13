package com.dp;

import java.util.Arrays;

/*
递归暴力求 时间复杂度高 存在大量重复计算结果
迭代从后往前计算
 */
public class lengthMaxQueue03 {
    static int[] res = new int[5];
    public static void main(String[] args) {
        int[] nums = {1,5,2,4,3};
        for(int i=0;i<res.length;i++) {
            res[i]=1;   //每个值的最长递增序列默认为1
        }
        //调用求最大递增子序列长度的方法
        System.out.println(resLengthMax(nums));
    }

    //对序列中的每个值都进行计算
    public static int resLengthMax(int[] nums) {
        for(int i=nums.length-1;i>=0;i--) { //外循环控制从后往前计算
            for(int j = i+1;j<nums.length;j++) {    //计算i后面的最大递增序列长度
                if(nums[j]>nums[i]) {   //j比i大，存在递增关系，i和j之间至少构成2个长度递增序列
                    res[i] = Math.max(res[i],res[j]+1); //当前的最大递增长度
                }
            }
        }
        //从小到大排序
        Arrays.sort(res);
        //返回最大值，也就是最大子序列的长度
        return res[res.length-1];
    }
}

