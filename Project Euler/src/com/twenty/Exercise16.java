package com.twenty;

import java.math.BigInteger;

public class Exercise16 {
    public static void main(String[] args) {
        BigInteger res = new BigInteger("2").pow(1000);
        String strs = res.toString();
        String[] split = strs.split("");
        long sum = 0L;
        for(int i=0;i<split.length;i++) {
            sum+=Integer.parseInt(split[i]);
        }
        System.out.println(sum);
//        System.out.println(res);
    }
}
