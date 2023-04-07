package com.第四届校内模拟;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-12-09 11:00
 * @Description
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=n;i<2000000; i++) {
            int res = getRevNum(i);
            if ( res <= 200000 && res >= 100000) {
//                System.out.println(res);
                System.out.print(i);
                return;
            }
        }
        System.out.println("F");
    }
    private static int getRevNum(int n) {
        int num = n;
        int rev = 0;
        while (n != 0) {
            int a = n % 10;
            n = n / 10;
            rev = rev * 10 + a;
        }
        return Math.abs(num - rev);
    }
}
