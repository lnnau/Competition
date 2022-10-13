package top.plutos;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        //第一列赋值
        for(int i=0;i<n;i++) {
            arr[i][0] = i;
        }
        //第二列赋值
        for(int i=0;i<n;i++) {
            arr[i][1] = sc.nextInt();
        }
        //按照值从小到大排序
        boolean flag =true;
        for(int i=0;i<n;i++) {
            flag=false;
            for(int j=0;j<n-i-1;j++) {
                if (arr[j][1]>arr[j+1][1]) {
                    int tp0 = arr[j][0];
                    int tp1 = arr[j][1];
                    arr[j][0]=arr[j+1][0];
                    arr[j][1]=arr[j+1][1];
                    arr[j+1][0]=tp0;
                    arr[j+1][1]=tp1;
                    flag=true;
                }
            }
        }
        int[] res = new int[n]; //保存每个同学需要再刷题的结果
        //遍历刷题数量
        int tp = n/2;
        for(int i=0;i<tp;i++) { //只需要遍历前半段
            int num = arr[tp][1]-arr[i][1]+1;   //求出该同学需要再刷多少题
            res[arr[i][0]] = num;
        }
        for(int i=0;i<n;i++) {
            System.out.print(res[i]+" ");
        }
    }
}
