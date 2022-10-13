package com.去年决赛;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(); //整数序列
        int K=sc.nextInt(); //分割值
        Integer[] arr=new Integer[N];
        for(int i=0;i<N;i++) {
            arr[i]=sc.nextInt();    //输入序列
        }
        //1到K之间的数升序排列
        Arrays.sort(arr,0,K);
        //K+1到N之间的数降序排列
        Arrays.sort(arr,K,N, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        int mid1=(K+1)/2;   //第一部分的中间值
        Arrays.sort(arr, mid1, K, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        }); //降序排列
        int mid2=K+(N-K+1)/2;   //第二部分的中间值，上取整
        Arrays.sort(arr,K,mid2);  //升序排列

        for(Integer i:arr) {
            System.out.print(i+" ");
        }
        System.out.println();   //输出所有数据后换行
    }
}
