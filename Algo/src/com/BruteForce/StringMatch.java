package com.BruteForce;

import java.util.Scanner;

public class StringMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入主串：");
        String[] S = scanner.nextLine().split("");
        System.out.println("请输入子串：");
        String[] T = scanner.nextLine().split("");
        int count = 0;
        //外循环控制比较主串的起始值
        for(int i=0;i<S.length;i++) {
            //子串第一个与主串有匹配时再进行子串的后续比较
            if(S[i].equals(T[0])) {
                count++;
                int tp = i+1;
                //内循环比较整个子串是否和主串匹配
                for(int j=1;j<T.length && i+1<S.length;j++) {
                    //挨个字符比较
                    if(S[tp].equals(T[j])) {
                        //指针移动
                        tp++;
                        count++;
                    }
                }
            }

        }
        System.out.println("T在S中出现"+(count/T.length)+"次");
    }
}
