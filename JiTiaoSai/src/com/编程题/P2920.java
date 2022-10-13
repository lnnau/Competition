package com.编程题;
import java.util.Scanner;
public class P2920 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int nums = sc.nextInt();
            int count=0;
            for(int i=1;i<=nums;i++) {
                if(Math.sqrt(i)%1==0) {
                    count++;
                }
            }
            System.out.print(count);
    }
}
