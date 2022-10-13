package com.twenty;

//多约数（因数）的三角形数
public class Exercise12 {
    public static void main(String[] args) {
            long sum=0;
        for (long i = 1; ; i++) {
             sum +=i;
            //求三角数
                if (countFactor(sum) > 500) {
                    System.out.println(sum);
                    return;
                }
        }
    }

    //计算约数个数
    public static int countFactor(long num) {
        int count = 0;
        //采用时间复杂度低的计算方法
        for (int i = 1; i*i <= num; i++) {
            //能被整除是num的因数
            if (num % i == 0) {
                if(i*i==num)   //i能整除num，说明num/i也能整除num
                count++;
                else count+=2;  //得到一个能整除num的值也可以知道另一个也可以整除
            }
        }
        return count;
    }
}
