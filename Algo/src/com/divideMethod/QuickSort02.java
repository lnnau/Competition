package com.divideMethod;

import java.util.Random;
import java.util.Scanner;

public class QuickSort02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr = new int[m];
        sc.nextLine();
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        //调用快速排序方法
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    //快速排序
    private static void quickSort(int[] arr,int low,int high) {
        //将当前序列上下界保存下来
        int i=low,j=high;
        if(i<j) {
            //获取轴值位置
            int res = getRandom(low,high);
            //将轴值位置交换到第一个元素上
            int temp=arr[low];
            arr[low]=arr[res];
            arr[res]=temp;
            //获取中枢值
            int pivot = arr[low];
            while(i<j) {
                while(i<j && arr[j]>=pivot) {
                    //j从右往左扫描
                    j--;
                }
                //将比中枢值小的值和中枢值进行交换
                temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                while(i<j && arr[i]<=pivot) {
                    i++;
                }
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            quickSort(arr,low,i-1);
            quickSort(arr,i+1,high);
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
