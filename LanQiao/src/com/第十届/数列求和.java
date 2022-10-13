package com.第十届;

import java.math.BigInteger;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-03-23 16:46
 * @Description 时间复杂度太高
 * @Result
 */
public class 数列求和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        BigInteger res = new BigInteger("0");
        BigInteger tp1 = new BigInteger("1");
        BigInteger tp2 = new BigInteger("1");
        BigInteger tp3 = new BigInteger("1");
        for(long i = 4;i<=num;i++) {
            res = new BigInteger("0").add(tp1).add(tp2).add(tp3);
            tp1 = tp2;
            tp2 = tp3;
            tp3 = res;
            System.out.println(res.remainder(new BigInteger("100000")));
        }
        System.out.println(res);
    }
}
