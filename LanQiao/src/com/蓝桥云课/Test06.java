package com.蓝桥云课;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        double complyMan = 0;  //及格人数
        double excellentMan = 0;   //优秀人数
        for(int i=0;i<num;i++) {
            int score = sc.nextInt();
            if(score>=85) {
                excellentMan++;
            } else if(score>=60) {
                complyMan++;
            }
        }
        double res1 = ((complyMan+excellentMan)/num) * 100;
        double res2 = (excellentMan/num) * 100;
        System.out.println(Math.round(res1)+"%");
        System.out.println(Math.round(res2)+"%");
    }
}
