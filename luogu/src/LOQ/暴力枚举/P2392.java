package LOQ.暴力枚举;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-13 15:58
 * @Description
 */
public class P2392 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = new int[4];
        for (int i=0;i<4;i++)
            s[i] = sc.nextInt();
        int[][] arr = new int[4][21];
        int[][] path = new int[4][21]; //存放相邻数的差值
       for (int i = 0;i<4;i++) {
           for (int j=0;j<s[i];j++) {
               arr[i][j] = sc.nextInt();
           }
       }
        //从大到小排序
        sort(arr);
        //求相邻元素差值 最右到21-1
        for (int i = 0;i<4;i++) {
            for (int j = 0;j<s[i]-1;j++) {
                path[i][j] = arr[i][j]-arr[i][j+1];
            }
        }
        //求最短时间
        int sum = 0;
        for (int i=0;i<4;i++) {
            //每科用最短时间累加
            for (int j=0;j<s[i];j++) {
                sum+=path[i][j];
            }
            sum = sum+arr[i][s[i]/2];
        }
        System.out.println(sum);
    }
    private static void sort(int[][] arr) {
        for (int i=0;i<4;i++) {
            for (int j=0;j<20;j++) {
                if (arr[i][j]<arr[i][j+1]) {
                    int tp = arr[i][j];;
                    arr[i][j] = arr[i][j+1];
                    arr[i][j+1] = tp;
                }
            }
        }
    }
}
