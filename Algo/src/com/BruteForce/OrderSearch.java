package com.BruteForce;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-15 15:18
 * @Description
 * input:数组、待查找元素
 * output:元素下标或者-1
 * for i←0 to n do
 *  if arr[i]=num
 *      return i;
 * return -1;
 * @Result
 */
public class OrderSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input array length:");
        int len = sc.nextInt();
        System.out.println("please input array:");
        int[] arr = new int[len];
        for(int i=0;i<len;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("please input search varable");
        int num = sc.nextInt();
        System.out.println(orderSearch(arr,num));
    }
    private static int orderSearch(int[] arr,int num) {
        for(int i=0;i<arr.length;i++) {
            //查找到就返回待查找元素在数组中的下标
            if(arr[i]==num) {
                return i;
            }
        }
        //没有找到就返回-1
        return -1;
    }
}