package com.base;

import java.util.Scanner;

/**冒泡排序
 * QuickSort
 * 输入：一个无序数组
 * 输出：一个有序数组
 * arr[n];
 * for i ← 1 to n-1 do
 * for j ← i+1 to n do
 * if arr[i] > arr[j]
 * temp ← arr[i];
 * arr[i] ← arr[j];
 * arr[j] ← temp;
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input array length:");
		int len = sc.nextInt();
		System.out.println("please input array:");
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
		System.out.print("排序后:");
		for(int i:arr)
			System.out.print(i+" ");
	}
	private static void bubbleSort(int[] arr) {
		int temp;
		int len = arr.length;
		boolean flag = true;
		//n个元素执行n-1次循环
		for(int i=0;flag;i++) {
			flag = false;
			for(int j=0;j<len-i-1;j++) {
				//从小到大排序
				if(arr[j]>arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					//执行过交换就将顺序标记为true
					flag = true;
				}
			}
		}
	}
}
