package com.第十届;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-25 10:06
 * @Description
 * @Result
 */
public class 人物相关性分析 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String[] strs = sc.next().split("");
        String[] a = "Alice".split("");
        String[] b = "Bob".split("");
        int len = strs.length;
        for(int i=0;i<len;i++) {
            int tp = i+1;   //第一个元素匹配上，就直接从第二个元素匹配
            if(strs[i].equals("A")) {
                int count = 1;
                //匹配是否是Alice
                for(int j=1;j<a.length&&tp+1<len;j++) {
                    if (strs[tp].equals(a[j])) {
                        tp++;
                        count++;
                    }
                }
                //匹配到
            }
        }
    }
}
