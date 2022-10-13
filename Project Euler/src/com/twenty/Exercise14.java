package com.twenty;

//最长考拉兹序列
public class Exercise14 {
    public static void main(String[] args) {
        int count = 0;
        int max = 0;
        long temp = 0;
        int resNum = 0;
        for (int i = 1; i <= 1000000; i++) {
            temp = i;   //把起始值暂存
            while (temp != 1) {
                if (temp % 2 == 0) {
                    temp /= 2;
                    count++;
                } else {
                    temp = 3 * temp + 1;
                    count++;
                }
            }
            if(count+1>max) {
                max = count+1;
                resNum=i;   //记录最长考拉兹序列的i值
            }
            count=0;    //计数器重置
        }
        System.out.println(resNum);
    }
}

