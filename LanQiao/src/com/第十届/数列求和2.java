package com.第十届;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-23 18:31
 * @Description 第20190324项不超过int范围，用数组暂存数据
 * @Result  4659
 */
public class 数列求和2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //数组记录，空间换时间
        long[] res = new long[num];
        res[0]=res[1]=res[2]=1;
        for(int i=3;i<num;i++) {
            res[i]=res[i-1]+res[i-2]+res[i-3];
            //只需要后四位即可
            if(res[i]>10000) {
                res[i]%=10000;
            }
        }
        System.out.println(res[num-1]);
    }
}
