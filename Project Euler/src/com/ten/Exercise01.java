package com.ten;

public class Exercise01 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=3; i<1000;i++) {
            if(i%3==0 || i%5==0) {  //被3或者5整除
                sum+=i;
            }
        }
        System.out.println(sum);    //233168
    }
}
