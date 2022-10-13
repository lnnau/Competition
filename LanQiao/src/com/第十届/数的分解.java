package com.第十届;
import java.util.*;
/**
 * @Author Lunau
 * @Create 2022-03-23 19:34
 * @Description 三层循环暴力，通过对余数做除法判断是否存在2和4
 * @Result in 2019  out 40785
 */
public class 数的分解 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = 0;
        for (int i = 1; i < num; i++) {
            for (int j = i+1; j < num; j++) {
                int k = num-i-j;
                //k>j   确保abc型只计数一次，确保k>0
                if(j<k && judge(i) && judge(j) &&judge(k))
                    res++;
                //判断是否出现过，是否存在2和4

            }
        }
        System.out.println(res);
    }
    //判断是否包含2和4
    private static boolean judge(int num) {
        //转成字符串再通过contains判断
        String s = ""+num;
        return !(s.contains("2") || s.contains("4"));
    }
}
