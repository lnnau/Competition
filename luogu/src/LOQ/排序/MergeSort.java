package LOQ.排序;

import java.util.Arrays;
import java.util.Scanner;

/*
归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input array length:");
        int len = sc.nextInt();
        System.out.println("please input array element：");
        int[] arr = new int[len];
        for(int i=0;i<len;i++) {
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //拆分数组，成为单个有序的
    private static void mergeSort(int[] arr,int low,int high) {
        //当low==high的时候，只有一个元素，所以不需要排序
        if(low<high) {
            //得到中间值，把原来的数组分成两部分
            int mid = (low+high)/2;
            //递归调用左半部分进行分组
            mergeSort(arr,low,mid);
            //递归调用右半部分进行分组
            mergeSort(arr,mid+1,high);
            //合并左半部分和右半部分
            merge(arr,mid,low,high);
        }
    }
    //合并左半部分和右半部分
    private static void merge(int[] arr,int mid,int low,int high) {
        //记录左区域的第一个值
        int lPot = low;
        //记录右区域的第一个值
        int hPot = mid+1;
        //临时数组的起始值，也就是low
        int start = 0;
        //合并的临时数组
        int[] temp = new int[high-low+1];
        //合并两个有序序列
        while(lPot<=mid && hPot<=high) {
            //左区域第一个元素小于右区域第一个元素
            if(arr[lPot]<arr[hPot]) {
                temp[start++] = arr[lPot++];
            } else {
                temp[start++] = arr[hPot++];
            }
        }
        //合并左区域剩余元素
        while(lPot<=mid) {
            temp[start++] = arr[lPot++];
        }
        //合并右半区域元素
        while(hPot<=high) {
            temp[start++] = arr[hPot++];
        }
        //覆盖原数组空间
        for(int i=0;i<temp.length;i++) {
            arr[i+low] = temp[i];
        }
    }
}
