package com.第十二届;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-16 14:24
 * @Description input:0~9每张卡片的数量，拼数的起始值
 * output:从1能拼到的最大的数
 * @Result 输入2021 输出3181
 */
public class 卡片 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cade = new int[10];
        int n = sc.nextInt();
        //记录每个数字卡片数量
        for (int i = 0; i < 10; i++) {
            cade[i] = n;
        }
        for (int i = 1; ; i++) {
            //得到当前数字的长度
            String len = "" + i;
            //拼接数
            int tp = i;
            //卡片不能出现-1的情况 出现-1就结束
            if (judgeCade(cade)) {
                for (int j = 0; j < len.length(); j++) {
                    int num = tp % 10;
                    cade[num]--;
                    tp /= 10;
                }
            } else {
                //减去为-1的那个数(说明出现-1了，正确时前一位，由于i多加了一次，还要减去1)和多加一位i
                System.out.println(i - 2);
                break;
            }
        }
    }

    //判断卡片是否出现数量是否出现-1
    private static boolean judgeCade(int[] cade) {
        for (int i = 0; i < cade.length; i++) {
            if (cade[i] == -1)
                return false;
        }
        return true;
    }
}
