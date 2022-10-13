package com.divideMethod;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-03-25 10:28
 * @Description sum>0就加，sum<0就重置sum再加 res和加后的sum比较，sum比res大再把sum赋值给res
 * @Result
 */
public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("数组长度:");
        int len = sc.nextInt();
        System.out.println("数组元素（空格间隔）:");
        int[] arr = new int[len];
        for(int i=0;i<len;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
    private static int maxSubArray(int[] arr) {
        //只有一个元素返回自身
        if(arr.length==1) return arr[0];
        int sum = 0;    //累加值
        int res = arr[0];    //当前阶段的最优值
        for(int i=0;i<arr.length;i++) {
            res = Math.max(res,sum+=arr[i]);    //寻找最优解
            if(sum<0) {
                sum = 0;    //sum<0就从0重新开始，负数加上其他数相当于损失，所以重新计数
            }
        }
        return res;
    }
}
