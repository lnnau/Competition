package com.divideMethod;
/**
 * 随机选取轴值 中间不移动轴值改进版
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int len = sc.nextInt();
        System.out.println("请输入数组元素：");
        int[] arr = new int[len];
        for (int i=0;i<len;i++)
            arr[i]=sc.nextInt();
        //调用方法
        partition(arr,0,len-1);
        System.out.println(Arrays.toString(arr));
    }
    private static void partition(int[] arr,int first,int end) {
        int low=first;
        int high=end;

        if(low<high) {
            int res = getRandom(first,end);
            //将轴值和第一个元素进行交换
            int temp=arr[low];
            arr[low]=arr[res];
            arr[res]=temp;
            //第一个值作为获取基准值
            int pivot = arr[low];
            while(low<high) {

                //右序列中比pivot小的需要被放在右边
                while(low<high && arr[high]>=pivot) {
                    high--;
                }
                while(low<high && arr[low]<=pivot) {
                    low++;
                }
                //当两个指针都各找到一个需要交换的值的时候才交换
                temp = arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
            }
            //当退出循环，说明当前轴值的位置被确定，把轴值交换到确定的位置
            arr[first] = arr[low];
            arr[low] = pivot;
            //左序列递归进行   当前low和high指向同一位置
            partition(arr,first,low-1);
            //右序列递归进行
            partition(arr,low+1,end);
        }
    }
    //产生随机数
    private static int getRandom(int low,int high) {
        //创建随机数对象
        Random ran = new Random();
        //确保随机数范围
        int res = ran.nextInt(high-low)+low;
        return res;
    }
}
