package com.ten;

public class Exercise05 {
    public static void main(String[] args) {
        for(int i=2521;;i++) {
            boolean flag = true;    //每判断一个数就重置开关
            for(int j=1;j<=20;j++) {
                if(i%j!=0) {
                    flag=false; //不能被1-20全部整除就不算
                    break;
                }
            }
            if(flag) {//可以被1-20 全部整除就输出结果，跳出循环
                System.out.println(i);  //232792560
                break;
            }
        }
    }
}
