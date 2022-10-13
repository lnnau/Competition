package com.ten;
//特殊毕达哥拉斯三元组
public class Exercise09 {
    public static void main(String[] args) {
        for(int a=1;a<1000;a++) {
            for(int b=a+1;b<1000;b++) {
                int c = 1000-a-b;   //满足和为1000
                if(a<b && b<c && a*a+b*b==c*c ) {
                    System.out.println(a+" "+b+" "+c+" "+a*b*c);
                    return; //200 375 425 31875000
                }
            }
        }
    }
}
