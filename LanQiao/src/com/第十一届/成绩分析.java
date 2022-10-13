package com.第十一届;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-03-21 19:07
 * @Description
 * @Result
 */
public class 成绩分析 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int min = 100;
        double avg = 0d;
        int sum = 0;
        for(int i=0;i<n;i++) {
            int grade = sc.nextInt();
            if(grade>max)
                max = grade;
            if(grade<min)
                min = grade;
            sum+=grade;
        }
        System.out.println(max);
        System.out.println(min);
        //强制类型转换后再赋值，否则会精度损失
        avg = (double)sum/n;
        System.out.printf("%.2f",avg);
    }
}
