package com.第十二届;

/**
 * @Author Lunau
 * @Create 2022-03-16 16:26
 * @Description
 * @Result
 */
public class 货物摆放2 {
    public static void main(String[] args) {
        //存放n值
        long n = 2021041820210418L;
        int count = 0;
        //三重循环判断是否满足l*w*h=n
        for(long i=0;i<n;i++) {
            for(long j=0;j<n;j++) {
                for(long m=0;m<n;m++) {
                    if(n==i*j*m) {
                        System.out.println(i+" "+j+" "+m);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
