package com.第十二届;
import java.util.*;
/**
 * @Author Lunau
 * @Create 2022-03-14 19:08
 * @Description
 * @Result
 */
public class 杨辉三角 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //创建二维坐标
        int[][] arr = new int[N+10][N+10];
        //构造杨辉三角
        //第一层第一个为1
        arr[1][1] = 1;
        for(int i=1;i<=N+8;i++) {
            //第N层就有N个数
            for(int j=1;j<=i+1;j++) {
                arr[i+1][j] = arr[i][j]+arr[i][j-1];
            }
        }
        //寻找N第一次出现的位置
        int count = 1;
        if(N==1)
            System.out.println(1);
        else {
            //遍历杨辉三角寻找符合的值
            for(int i=1;i<=1000;i++) {
                for (int j=1;j<=i+1;j++) {
                    if(arr[i][j]==0) {
                        continue;
                    } else if(arr[i][j]!=N) {
                        count++;
                    } else if(arr[i][j]==N) {
                        System.out.println(count);
                        return;
                    }
                }
            }
        }
    }
}
