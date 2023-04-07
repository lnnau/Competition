package com.第十四届模拟;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-03 11:40
 * @Description
 */
public class Test{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long t = scanner.nextLong();
        long c = scanner.nextLong();
        long s = scanner.nextLong();
        double v = t * 1.0 / c;
        s -= c;
        double cnt = s * v;
        if(cnt - (int)cnt > 0){
            System.out.println((int)cnt + 1);
        }else{
            System.out.println((int)cnt);
        }
    }
}
