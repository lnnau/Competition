package com.真题;

/**
 * 2022年3月9日19:50:15
 * 题上没有给出枚举的结束值，但是可以通过实验的到符合条件的数只在
 * 一个范围中出现 小于100
 */
public class 简单枚举 {
    public static void main(String[] args) {
        //计数器
        int count = 0;
        for(int i=1;i<100;i++) {
            count+=judgeMethod(i);
        }
        System.out.println(count);
    }
    //判断该数按位累加结果和其立方值是否相同
    private static int judgeMethod(long num) {
        long cube = (long) Math.pow(num,3);
        long sum = 0;
        //将整数转换成字符串数组，方便进行累加
        String[] strs = String.valueOf(cube).split("");
        for(int i=0;i<strs.length;i++) {
            sum+=Integer.parseInt(strs[i]);
        }
        if(num==sum)
            return 1;
        return 0;
    }
}
