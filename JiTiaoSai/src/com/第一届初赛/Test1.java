package com.第一届初赛;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-16 21:45
 * @Description 解二元一次方程
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int Z = sc.nextInt();
        int A = (3 * Z - 4 * L) / 14;
        int B = (6 * L - Z) / 14;
        System.out.println(A+" "+B);
    }
}
