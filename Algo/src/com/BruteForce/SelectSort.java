package com.BruteForce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-15 15:36
 * @Description
 * input:待排序数组
 * output:有序数组
 *for i to 1 do n :
 *  min=i;
 *  for j to i+1 do n-1:
 *      if arr[min]>arr[j]:
 *          min=j;  //把最小的给min
 *  //执行一趟循环后进行交换
 *  temp=arr[min];
 *  arr[min]=arr[i];
 *  arr[i]=emp
 * @Result
 */
public class SelectSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input array length:");
        int len = sc.nextInt();
        System.out.println("please input array:");
        int[] arr = new int[len];
        for(int i=0;i<len;i++) {
            arr[i]=sc.nextInt();
        }
        selectSort(arr);
        System.out.print("排序后:");
        for(int i:arr)
            System.out.print(i+" ");
    }
    private static void selectSort(int[] arr) {
        boolean flag = true;
        for(int i=0;flag;i++) {
            //未排序序列的起始值
            int min = i;
            flag = false;
            for(int j=i+1;j<arr.length;j++) {
                //每次取未排序序列中的最小值
                if(arr[min]>arr[j]) {
                    min=j;
                    //进行交换则说明有需要排序的
                    flag = true;
                }
            }
            if(flag) {
                //每趟循环都找到选择出一个排好序的进行交换
                int tp = arr[min];
                arr[min] = arr[i];
                arr[i] = tp;
                //输出每趟排序后的结果
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
