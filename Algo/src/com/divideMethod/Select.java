package com.divideMethod;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-04-05 20:32
 * @Description
 * @Result
 */
public class Select {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入数组元素（空格隔开）");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("请输入整数k：");
        int k = sc.nextInt();
        int min = -1;
        int tp = 0;
        for(int i=0;i<k;i++) {  //第k小的元素需要遍历整个数组k次，每次找出当前最小的
            min = 1000000;
            for(int j=0;j<n;j++) {  //每趟遍历找出一个最小值
                if(arr[j]<min) {
                    min = arr[j];
                    tp = j; //记录当前最小值下标
                }
            }
            arr[tp] = 1000000;  //将当前最小值修改为极大值，避免影响下次结果
        }
        System.out.println(min);
    }
}
