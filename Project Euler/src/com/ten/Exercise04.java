package com.ten;

import java.util.Scanner;

/*
两个三位数相乘，值的范围   需要模拟两数相乘才行，因为直接
给出值的范围，该值可能为质数
100*100=10000
999*999=998001
 */
public class Exercise04 {
    public static void main(String[] args) {
        /*long res=0;
        for(long i=100;i<=9801;i++) {
            if(f(i)) {  //是回文数
                res=i;       997799
            }
        }*/
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        long res=0;
        long min = (long) (Math.pow(10,n-1)); //求最大回文数，从最大值相乘开始往下找
        long max = (long) (Math.pow(10,n)-1);
        for(long i=max;i>=min;i--) {
            for(long j=max;j>=min;j--) {
                long temp=i*j;
                if (f(temp) && temp>res) {
                    res=temp;
                }
            }
        }

        System.out.println(res%1337);    //906609
    }
    //求回文数
    public static boolean f(long num){
        String str = num+"";
        long length = str.length();
        long num2=0;
        for(long i=0;i<length/2;i++) {
            num2=num%10+num2*10;
            num=num/10;
        }
        if(length%2!=0) {   //奇数的情况需要对原数据多除一次，中间的值不用比较
            num=num/10;
        }
       return num==num2;
    }
}
