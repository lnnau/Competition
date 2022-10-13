package com.第十届;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-24 19:43
 * @Description
 * 1.枚举1到n的数
 * 2.判断这些数中是否含有0、1、2、9 （前导0需要特判），其实也不用特判，枚举过程已经筛出去了
 * 3.符合的数进行求和
 * @Result
 */
public class 特别数的和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++) {
            if(judge(i))
                sum+=i;
        }
        System.out.println(sum);
    }
    //判断i是否符合条件
    private static boolean judge(int num) {
        String len = ""+num;
        for(int i=0;i<len.length();i++) {
            //获取尾数
            int tp = num%10;
            //去掉位数
            num/=10;
            if(tp==1 || tp==0 || tp==2 || tp==9)
                return true;
        }
        //循环执行完说明不符合条件
        return false;
    }
}
