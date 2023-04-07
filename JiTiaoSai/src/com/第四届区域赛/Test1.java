package com.第四届区域赛;

import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-12-18 14:47
 * @Description
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.nextLine().toCharArray();
        int[] arr = new int[60];
        String res = "";
        for (int i = 0; i < ch.length; i++) {
            arr[ch[i]]++;
        }
        //若1和0存在先把这两个添加
        if (arr[49] > 0) {
            for (int i=0; i<arr[49]; i++) {
                res += 1;
            }
        }
        if (arr[48] > 0) {
            for (int i=0; i<arr[48]; i++) {
                res += 0;
            }
        }
        for (int i=50; i<arr.length; i++) {
            //有值
            if (arr[i] > 0 ) {
                for (int j=0; j<arr[i]; j++) {
                    res += (i-48);
                }
            }
        }
        System.out.print(res);
    }
}
