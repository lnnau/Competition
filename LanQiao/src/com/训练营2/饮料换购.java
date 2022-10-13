package com.训练营2;
import java.util.Scanner;
public class 饮料换购 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = sc.nextInt();
        //空瓶盖数
        int blank = 0;
        //换购数
        int temp=res;
        do {
            temp=temp/3;
            res+=temp;
        } while(temp!=0);
        {
            temp = temp / 3;
            res += temp;
        }
        System.out.println(res);
    }
}
