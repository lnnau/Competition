package com.BruteForce;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-15 15:31
 * @Description
 * input:数组、待统计元素
 * output:待统计元素出现次数
 * for i←0 to n do
 *  if arr[i]=num
 *      count++;
 * @Result
 */
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input array length:");
        int len = sc.nextInt();
        System.out.println("please input array:");
        int[] arr = new int[len];
        for(int i=0;i<len;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("please input count varable");
        int num = sc.nextInt();
        System.out.println("num"+"在数组中出现了"+count(arr,num)+"次");
    }
    private static int count(int[] arr,int num) {
        //计数器
        int count = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==num) {
                count++;
            }
        }
        return count;
    }
}
