package com.第十二届;

import java.util.*;

/**
 * @Author Lunau
 * @Create 2022-03-16 16:03
 * @Description
 * @Result  2430
 */
public class 货物摆放 {
    public static void main(String[] args) {
        //存放n值
        long n = 2021041820210418L;
        int count = 0;
        //求出所有的因数
        List<Long> ls = new ArrayList<>();
        for(long i=1;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                ls.add(i);
//                System.out.println(i);
                //n%i==0，i可以被n整除，那么n/i也可以被n整除
                //16%4 == 0 而且另一个因数也为4，只加入4；16%8=0，另一个因数为2，加入2和8
                if(i!=n/i) {
                    ls.add(n/i);
//                    System.out.println(n/i);
                }
            }
        }
        //三重循环判断是否满足l*w*h=n
        for(int i=0;i<ls.size();i++) {
            for(int j=0;j<ls.size();j++) {
                for(int m=0;m<ls.size();m++) {
                    if(n==ls.get(i)*ls.get(j)*ls.get(m)) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
