package com.蓝桥云课;
//月份和周一重复34天
//口算法，容易出错
public class Test04 {
    public static void main(String[] args) {
        int year = 1;   //起始年份
        int month = 1;  //起始月份
        int sum=366*4+365*16+366-91;    //正常跑的  也可以通过excal计算
        System.out.println(sum);
        int res = 0;
        for(int i=6;i<=sum;i++) {
            if(i%7==1) {
                res++;
            }
        }
        System.out.println(res+sum+12*20+10-34);
    }
//    //月初判断方法
//    public static Boolean method(int num,int year,int month) {
//        if(year==1 || year==3 || year==5 || year==7 || year==8 || year==10 || year==11) {
//            num
//        }
//    }
}
