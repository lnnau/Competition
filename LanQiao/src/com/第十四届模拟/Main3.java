package com.第十四届模拟;

/**
 * @Author Lunau
 * @Create 2022-12-03 14:14
 * @Description
 */
public class Main3 {
    public static void main(String[] args) {
        for (int i=10; i<10000; i++) {
            //先转16进制,默认再转换10进制赋值给a
            int a = Integer.parseInt(i + "", 16);
            if (a % i == 0) {
                System.out.println("10进制："+i+" 的16进制的10进制:"+a);
            }
        }
    }
}
