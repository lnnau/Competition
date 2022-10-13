package com.第十二届;

import java.util.Arrays;

/**
 * @Author Lunau
 * @Create 2022-03-14 19:38
 * @Description 测试int数组长度
 * @Result
 */
public class ArrLength {
    public static void main(String[] args) {
//        for(int i=0;;i++) {
//            System.out.println(i);
//            int[] arr = new int[i];
//        }

        //测试Arrays.sort()范围排序
        int[] arr = {9,8,4,2,1,3};
        Arrays.sort(arr,2,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
