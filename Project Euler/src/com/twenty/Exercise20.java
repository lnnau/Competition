package com.twenty;

import java.math.BigInteger;

//阶乘数字和
public class Exercise20 {
    public static void main(String[] args) {
        BigInteger nums = new BigInteger("1");
        //大数求阶乘
        for(int i=2;i<=100;i++) {
            nums = nums.multiply(new BigInteger(String.valueOf(i)));
        }
        String[] split = nums.toString().split("");
        //最终结果
        int sum = 0;
        for(int i=0;i<split.length;i++) {
            sum+=Integer.parseInt(split[i]);
        }
        System.out.println(sum);
//        System.out.println(nums);
    }
}
