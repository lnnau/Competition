package com.蓝桥云课;
/*
先打印出前39行的数据
20行20列的数据是39行中的第19个数
注意奇偶层不同，行开始的顺序也不一样
奇数层从左到右 偶数层从右到左
 */
public class Test03 {
    public static void main(String[] args) {
        int temp=1;
        //控制层数
        for(int i=1;i<40;i++) {
            System.out.print(i+":");
            for(int j=1;j<=i;j++) {
                System.out.print(temp+" ");
                temp++;
            }
            //打印完每层后换行
            System.out.println();
        }
    }
}
