package com.编程题;

import java.util.Scanner;

/*
某饮料店有两种奶茶饮料，其中一种每瓶含奶粉15g含茶粉5g，另一种每瓶含奶粉10g含茶粉10g。
设某天饮料店消耗的奶粉和茶粉重量分别为x和y（单位g)求当天饮料店两种饮料的销量。
 */
public class P3184 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nai = sc.nextInt(),cha = sc.nextInt();
        //第一种奶茶的销量
        int nums1 = (nai-cha)/10;
        //第二种奶茶的销量
        int nums2 = (cha-5*nums1)/10;
        System.out.print(nums1+" "+nums2);
    }
}
