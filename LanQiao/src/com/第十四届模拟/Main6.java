package com.第十四届模拟;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-03 16:30
 * @Description
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong(), c = sc.nextLong(), s = sc.nextLong();
        long res = ((s - c) * t) / c;
        System.out.print(res);
    }
}
