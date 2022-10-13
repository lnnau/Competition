package com.蓝桥云课;
//既约分数
public class Test02 {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=2020;i++) {
            for(int j=1;j<=2020;j++) {
                if(f(i,j)==1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    //辗转相除法求最大公约数
    public static int f(int a,int b) {
        if(a%b==0) {
            return b;   //最大公约数
        }else {
            return f(b,a%b);
        }
    }
}
