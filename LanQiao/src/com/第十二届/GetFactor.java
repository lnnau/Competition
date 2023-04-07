package com.第十二届;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-16 17:17
 * @Description 关于因数
 * @Result
 */
public class GetFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println(System.currentTimeMillis());

        System.out.println("优化代码："+factor2(num));
        System.out.println(System.currentTimeMillis());
        System.out.println("基础代码："+factor1(num));
        System.out.println(System.currentTimeMillis());

    }
    //求因数个数基础代码
    public static int factor1(long num) {
        int count=0;
        for(int i=1;i<=num;i++) {
            if(num%i==0)
                count++;
        }
        return count;
    }
    //求因数优化代码
    public static int factor2(long num) {
        int count = 0;
        for(int i=1;i<=Math.sqrt(num);i++) {
            if(num%i==0) {
                count++;
                //num%i==0，那么num/i也应该是num的因数，例如8和2 2是因数，4也是的
                if(i!=num/i) {
                    count++;
                }
            }
        }
        return count;
    }
}
