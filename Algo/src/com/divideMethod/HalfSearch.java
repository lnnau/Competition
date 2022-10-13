package com.divideMethod;

import java.util.*;
/*
 * 折半查找 HalfSearch
 * 输入：一个有序数据，待查找元素
 * 输出：查找结果
 *
 * while low<high do
 * 	mid ← (low+high)/2;
 * 	if arr[mid] = findvar
 * 		return mid;
 *  else if findvar < arr[mid]
 *  	high ← mid-1;
 *  else if findVar > arr[mid]
 *  	low ← mid+1;
 *
 *  return mid;
 */

public class HalfSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("数组长度 数组元素（有序） 查找元素");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for(int i=0;i<len;i++)
            arr[i]=scanner.nextInt();
        int findVar = scanner.nextInt();
        int res = halfSearch(arr,findVar);
        System.out.println(findVar +"在数组中的位置是"+res);
    }
    static int halfSearch (int[] arr,int findVar) {
        //low和high是数组下标的下界和上界
        int low = 0,high = arr.length-1,mid;
        while(low<=high) {
            //求出中间值
            mid = (low+high)/2;
            if(arr[mid]==findVar) {
                return mid;
                //从前半部分找
            } else if(findVar<arr[mid]) {
                high = mid-1;
                //从后半部分找
            } else if(findVar>arr[mid]) {
                low = mid+1;
            }
        }
        return -1;
    }
}
