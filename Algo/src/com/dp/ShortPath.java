package com.dp;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-04-12 14:18
 * @Description
 * input:6 8
0 1 2
0 2 3
1 3 1
1 4 5
2 3 3
2 4 2
3 5 6
4 5 7
 * output:
 * →0→1→3→5
 * 9
 * @Result
 */
public class ShortPath {
    private static int max = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顶点的个数和边的个数：");
        int v = sc.nextInt(),e = sc.nextInt();
        int[][] arr = new int[v][v];
        //将图的原始矩阵元素初始化为极大值
        for(int i=0;i<v;i++) {
            for(int j=0;j<v;j++) {
                arr[i][j] = max;
            }
        }
        //输入顶点之间的权值
        System.out.println("请输入起点和终点和起点到终点上的权值：");
        for(int i=0;i<e;i++) {
            int start = sc.nextInt(),end = sc.nextInt(),weight = sc.nextInt();
            arr[start][end] = weight;
        }
        System.out.println(BackPath(arr,v));
    }
    //求有向图的最短路径
    private static int BackPath(int[][] arr,int vnum) {
        //存储最短路径和最短路径的值
        int[] path = new int[vnum];
        int[] value = new int[vnum];
        //path数组和value数组初始化 value初始为极大值，便于最最小路径判断使用
        Arrays.fill(value,max);
        //设置起始点 path[0]设置为-1，便于打印最短路径
        value[0] = 0;
        path[0] = -1;
        //i是遍历终点
        for(int i=1;i<vnum;i++) {
            //j是遍历起点
            for(int j=i-1;j>=0;j--) {
                //当前j到i的权值大小加上j之前的最优权值大小，小于上一个0到i的权值大小就更新value
                if(arr[j][i]+value[j]<value[i]) {
                    //把权值更小的放入value[i]中，value[i]相当于是min的作用
                    value[i] = arr[j][i]+value[j];
                    path[i] = j;    //保存起点
                }
            }
        }
        //打印起点到终点之间的最短路径
        int tp = path[vnum-1];
        StringBuffer sb = new StringBuffer();
        sb.append(vnum-1+"→").append(tp+"→");  //终点
        while(path[tp]>=0) {
            sb.append(path[tp]).append("→");
            tp = path[tp];  //path[tp]中记录的是前一个起点，更新tp
        }
        System.out.println(sb.reverse());
        return value[vnum-1];
    }
}
