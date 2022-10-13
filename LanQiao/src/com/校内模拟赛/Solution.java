package com.校内模拟赛;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        int ji;
        //奇偶数求出的奇数个数不同
        if(nums%2==0) {
            ji = nums / 2;
        } else {
            ji=(nums/2)+1;
        }
        BigInteger fenzi = new BigInteger("1");
        BigInteger fenmu = new BigInteger("1");
        for (int i = 1; i <= ji; i++) { //求分子
            fenmu=fenmu.multiply(BigInteger.valueOf(i));
        }
        if (nums % 2 == 0) {    //求分母
            for (int i = ji + 1; i <= nums; i++) {
                fenzi=fenzi.multiply(BigInteger.valueOf(i));
            }
        } else {
            for (int i = ji; i <= nums; i++) {
                fenzi=fenzi.multiply(BigInteger.valueOf(i));
            }
        }
        BigInteger res = fenzi.divide(fenmu);
        System.out.println(res.remainder(BigInteger.valueOf(1000000007)));
        long end = System.currentTimeMillis();
        System.out.println((end-start)+"毫秒");
    }
}
