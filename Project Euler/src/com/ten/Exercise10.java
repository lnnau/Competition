package com.ten;

public class Exercise10 {
    public static void main(String[] args) {
        long sum=0;
        for(int i=2;i<2000000;i++) {
            if(f(i)) {
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println(sum);    //142913828922
    }
    public static boolean f(int num) {
        boolean flag = true;
        for(int i=2;i<num;i++) {
           if(num%i==0) {
               flag=false;
               break;
           }
        }
        return flag;
    }
}
