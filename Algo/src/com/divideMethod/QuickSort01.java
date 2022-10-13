package com.divideMethod;

import java.util.Scanner;

public class QuickSort01 {
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
            //将当前序列第一个值作为中枢值
            int pivot = arr[i];
            while(i<j) {
                while(i<j && arr[j]>=pivot) {
                    //j从右往左扫描
                    j--;
                }
                //将比中枢值小的值和中枢值进行交换
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

                while(i<j && arr[i]<=pivot) {
                    i++;
                }
                //将比中枢值大的值进行交换
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            //对左序列进行递归调用
            quickSort(arr,low,i-1);
            quickSort(arr,i+1,high);
        }
    }
}
