package com.算法;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-11-14 18:39
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        /*for (int i=0;i<5;i++) {
            for (int j=i;j<5;j++) {
                System.out.print(" "+j);
            }
            System.out.println();
        }*/
        //testArray
        int[][] arr = new int[][]{{1,2,3},{4,5,6}};
        testArray(arr);
    }
    private static void testArray(int[][] arr) {
        //返回二维数组行长度
        System.out.println(arr.length);
        //返回二维数组列长度，索引不能越界
        System.out.println(arr[0].length);
        Arrays.fill(arr[0],0,3,0);
        for (int i : arr[0]) {
            System.out.println(i);
        }
    }
}
