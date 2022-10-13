package com.第十一届;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-21 19:54
 * @Description
 * @Result
 */
public class 单词分析 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split("");
        String str = "";
        int res = 0;
        //选取每个字符
        for(int i=0;i<strs.length;i++) {
            int count = 0;
            //将选取的每个字符和字符串中所有字符比较
            for(int j=i;j<strs.length;j++) {
                //第一次比较会将自身计算一次，所以count从0开始
                if(strs[i].equals(strs[j])) {
                    count++;
                }
            }
            //将出现次数最多的记录下来
            if(count>res) {
                res = count;
                str = strs[i];
            }
        }
        System.out.println(str);
        System.out.println(res);
    }
}
