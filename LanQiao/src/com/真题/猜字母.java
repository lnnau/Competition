package com.真题;

/**
 * 2022年3月9日19:37:32
 */
public class 猜字母 {
    public static void main(String[] args) {
        String strs = "abcdefghijklmnopqrs";
        String res = "";
        //把字符串重复拼接106次
        for (int i = 0; i < 106; i++) {
            res += strs;
        }
        //知道字符串中只剩一个字符时退出
        while (res.length() != 1) {
            for (int i = 0; i < res.length(); i++) {
                //第一个字符在数组中是0，所以要加一再求余数
                if (i+1 %2!= 0) {
                    //删除奇数位置的
                    res = res.substring(0, i) + res.substring(i + 1);
                }
            }
        }
        System.out.println(res);
    }
}
