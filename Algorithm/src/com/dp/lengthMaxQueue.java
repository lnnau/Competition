package com.dp;
/*
递归暴力求 时间复杂度高
 */
public class lengthMaxQueue {
    public static void main(String[] args) {
        int[] nums = {1,5,2,4,3,7};
        //调用求最大递增子序列长度的方法
        System.out.println(resLengthMax(nums));
    }

    //对序列中的每个值都进行计算
    public static int resLengthMax(int[] nums) {
        int maxLength = 0;
        for(int i=0;i<nums.length;i++) {
            maxLength = Math.max(maxLength,lengthMax(nums,i));
        }
        return maxLength;
    }
    //求当前值的最大子序列和长度
    public static int lengthMax(int[] nums, int n) {
        int maxLen = 0; //
        if(n==nums.length-1) {
            return 1;   //到达末尾返回1，最后的最长递增序列只能是自身，也就是1
        }
        //遍历所有的i，返回当前值的最长子序列
        for(int i=n+1;i<nums.length;i++) {
            if(nums[i]>nums[n]) {
                //如果i的值大于n的值，就递归调用i
                maxLen = Math.max(maxLen,lengthMax(nums,i)+1);
            }
        }
        return maxLen;
    }
}

