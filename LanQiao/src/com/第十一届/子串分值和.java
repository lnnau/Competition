package com.第十一届;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author Lunau
 * @Create 2022-03-21 19:24
 * @Description
 * @Result
 */
public class 子串分值和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //将字符串传唤为char
        char[] chars = str.toCharArray();
        int len  =str.length();
        int res = 0;
        for(int i=0;i<len;i++) {
            Set<Character> set = new HashSet<>();
            //内外循环配合求子串
            for(int j=i;j<len;j++) {
                //子串长度从小到打
                set.add(chars[j]);
                //通过set集合特点，没有重复元素，那么集合的长度就是子串中不同元素的个数
                res+=set.size();
            }
        }
        System.out.println(res);
    }
}
