package com.算法;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-05 7:48
 * @Description
 */
public class P58最后一个单词长度 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLastWord2(s));
    }
    private static int lengthOfLastWord(String str) {
        String[] strs = str.split(" ");
        int len = strs.length;
        String res = strs[len-1];
        return res.length();
    }
    private static int lengthOfLastWord2(String s) {
        int len = s.length();
        int count = 0;
        String[] strs = s.split("");
        for (int i=len-1;i>0;i--) {
            if (strs[i].equals(" ")) {
                count++;
            } else {
                return count;
            }
        }
        return 0;
    }
}
