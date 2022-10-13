package com.训练营2;

/**
 * @author Lunau
 * @create 2022-03-11 19:48
 * @Description 第n层的煤球数目层数之和
 * 171700
 */
public class 煤球数目 {
    public static void main(String[] args) {
        int res = 0;
        int count = 0;
        for(int i=1;i<=100;i++) {
            //记录当前层的煤球数
            count+=i;
            //记录目前为止所有煤球数
            res+=count;
        }
        System.out.println(res);
    }
}
