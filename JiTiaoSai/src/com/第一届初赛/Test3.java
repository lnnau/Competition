package com.第一届初赛;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-17 20:42
 * @Description
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        int indexS = 0;
        int indexT = 0;
        while (indexT < t.length && indexS <s.length) {
            //当前匹配到，子串指针后移
            if (s[indexS]==t[indexT]) {
                indexT++;
            }
            //主串指针遍历
            indexS++;
        }
        if (indexT == t.length) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }


 }
}
