package com.蓝桥云课;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-12 17:08
 * @Description
 */
public class 排列字母 {
    public static void main(String[] args) {
        String[] str = "WHERETHEREISAWILLTHEREISAWAY".split("");
        Arrays.sort(str);
        for (String s: str) {
            System.out.print(s);
        }
    }
}
