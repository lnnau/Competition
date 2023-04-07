package com.第十四届模拟;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-12-03 16:59
 * @Description
 */
public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        //回文部分前边界
        int i;
        for (i=0; i<len; i++) {
            //判断i到末尾是否构成回文
            if (helper(str.substring(i,len))) {
                break;
            }
        }
        //将i前的元素反转后放到末位
        for (int a=i-1; a>=0; a--) {
            str += str.substring(a,a+1);
        }
        System.out.print(str);
    }

    private static boolean helper(String str) {
        char[] chars = str.toCharArray();
        //对rev反转
        for (int i=chars.length-1,j = 0; i>=0 && j<chars.length; i--,j++) {
            if (chars[i]!=chars[j]) {
                return false;
            }
        }
        return true;
    }
}
