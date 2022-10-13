package com.第十届;

import java.util.*;
/**
 * @Author Lunau
 * @Create 2022-03-23 19:14
 * @Description 通过不断增加分隔区间的大小实现求子串，通过set结合去重
 * @Result  100
 */
public class 不同子串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs = sc.nextLine();
        int res = 0;
        //外循环控制分隔区间带大小
        for(int i=1;i<=strs.length();i++) {
            //通过set集合去重和保存子串
            Set<String> set = new HashSet<>();
            //此次分隔需要执行的次数   每次都才从第一个开始
            for(int j=0;j<strs.length() && j+i<=strs.length();j++) {
                set.add(strs.substring(j,j+i));
            }
            res+=set.size();
        }
        System.out.println(res);
    }
}
