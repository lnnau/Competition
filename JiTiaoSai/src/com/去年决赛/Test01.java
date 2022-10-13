package com.去年决赛;
import java.util.Scanner;
/*
智能计价秤
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(); //饭菜种类
        double m=0,v=0,r=0,rsum=0,s=0; //打的四种菜品的价格
        sc.nextLine();  //吃回车符
        for(int i=0;i<N;i++) {
            String[] line = sc.nextLine().split(" ");   //得到一个菜品
            switch (line[0]) {
                case "M":
                    m+=(Double.parseDouble(line[1])/100)*Double.parseDouble(line[2]);
                    break;
                case "V":
                    v+=(Double.parseDouble(line[1])/100)*Double.parseDouble(line[2]);
                    break;
                case "R":
                    rsum+=Double.parseDouble(line[1]);
                    if(rsum>200) {  //当主食大于200g时才收费
                        v = ((rsum - 200) / 100) * Double.parseDouble(line[2]);
                        rsum=200;
                    }
                    break;
                case "S":
                    s+=(Double.parseDouble(line[1])/100)*Double.parseDouble(line[2]);
                    break;
            }
        }
        int run=sc.nextInt();   //获取步数
        double sum=m+v+r+s;
        if(run>=6000 && run<=9999) {
            System.out.printf("%.2f",sum*0.9);
        } else if(run>=10000) {
            System.out.printf("%.2f",sum*0.8);
        }else {
            System.out.printf("%.2f",sum);
        }
    }
}
