package com.ten;

public class Exercise03 {
    public static long num=600851475143L;
    public static void main(String[] args) {
        long k=2;   //最小质数
        for(;k<=num;) {
            if(k==num) {
                System.out.println(k);
                break;
            }else if(k<num && num%k==0) {
                num/=k;
                System.out.println(k);
            } else if(num%k!=0) {
                k++;
            }
        }
    }
}
