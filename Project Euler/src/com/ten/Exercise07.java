package com.ten;
/*
    第10001个质数
 */
public class Exercise07 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=2;;i++) {
            boolean flag = true;    //质数开关
            for(int j=2;j<i;j++) {
                if(i%j==0) {
                    flag=false; //存在能被1和自身之外的数整除，不是质数
                    break;
                }
            }
            if(flag) {
                count++;    //质数计数器加一
            }
            if(count==10001) {
                System.out.println(i);  //104743
                break;
            }
        }
    }
}
