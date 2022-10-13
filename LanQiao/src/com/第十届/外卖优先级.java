package com.第十届;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-03-24 20:14
 * @Description
 * @Result
 */
public class 外卖优先级 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();
        int[][] arr = new int[M][2];
        int[] store = new int[N+1];
        //读取数据
        for(int i=0;i<M;i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        //对M条信息按照时间递增排序
        bubbleSort(arr);
        //对M条信息进行操作 信息中的时刻不是连续的，循环控制的是时间
        //遍历信息
        for(int i=0;i<M;i++) {
            int ts = arr[i][0]; //暂存当前信息的时刻
            int id = arr[i][1]; //暂存当前店铺id
            //指定信息的值加加
            store[id]+=2;
            //当前时刻没有外卖的店铺优先级减一
            for(int k=i;k<=ts;k++)
            for(int j=1;j<=N&&j!=id;j++) {
                if(store[j]>0)  //优先级大于0的店铺才减
                    store[j]--;
            }
        }
        //统计符合的数量
        int res = 0;
        for(int i=0;i<store.length;i++) {
            if (store[i]>5)
                res++;
        }
        System.out.println(res);
    }
    //二维冒泡排序
    private static void bubbleSort(int[][] arr) {
        //获取行长度
        int len = arr.length;
        for(int i=0;i<len-1;i++) {
            for(int j=0;j<len-1-i;j++) {
                if(arr[j][0]>arr[j+1][0]) {
                    //交换
                    int tp1 = arr[j][0],tp2 = arr[j][1];
                    arr[j][0]=arr[j+1][0];arr[j][1]=arr[j+1][1];
                    arr[j+1][0]=tp1;arr[j+1][1]=tp2;
                }
            }
        }
    }
}
