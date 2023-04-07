package com.第四届区域赛;

import java.math.BigInteger;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        BigInteger res = new BigInteger("0");
        for (int i = 2; i <= N; i++) {
            //为素数
            if (isPrime1(i)) {
                //求其阶乘
                BigInteger tp = new BigInteger("1");
                for(int j=1;j<=i;j++){
                    tp = tp.multiply(new BigInteger(""+j));

                }
                tp = tp.remainder(new BigInteger("96577771"));
                res = res.add(tp);
                res.remainder(new BigInteger("96577771"));
            }
        }
        System.out.print(res);
    }
    public static boolean isPrime1(int x){
        boolean flag;
        int i=0;
        int j=0;
        flag=true;
        for(j=2;j<=Math.sqrt(x);j++){
            if(x%j==0){
                flag=false;
                break;
            }
        }
        if(j>Math.sqrt(x)){
            return true;
        }else{
            return false;
        }
    }
}
