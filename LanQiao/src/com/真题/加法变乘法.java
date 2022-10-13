package com.真题;

public class 加法变乘法 {
    public static void main(String[] args) {
        int res = 0;
        //第一层循环寻找第一个乘号的位置
        for (int i = 1; i <= 46; i++) {
            //第二层循环寻找第二个乘号的位置，和第一个乘号不能相邻
            for (int j = i + 2; j <= 48; j++) {
                res=0;
                res = i * (i + 1) + j * (j + 1);
                //三层循环把剩下的值加起来
                for (int m = 1; m <= 49; m++) {
                    //m不能是已经乘过的值
                    if(m!=i &&m!=i+1 &&m!=j && m!=j+1) {
                        res+=m;
                    }
                }
                //将最终的值进行比较
                if(res==2015) {
                    System.out.println(i);
                }
                }
        }
    }
}
