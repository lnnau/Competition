package com.第十一届;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-21 15:26
 * @Description 找到规律，n层n列是的值和层数有关，而且每层是从递增数是4的倍数
 * @Result 761
 */
public class 蛇形填数2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //第一层第一列结果
        int res = 1;
        //起始递增数
        int tp = 4;
        for(int i=2;i<=n;i++) {
            res+=tp;
//            tp=4*i;
            tp+=4;
        }
        System.out.println(res);
    }
}
