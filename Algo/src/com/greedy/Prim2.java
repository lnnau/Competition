package com.greedy;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-05-10 16:12
 * @Description
6 9
0 1 34
0 2 46
0 5 19
1 4 12
5 4 26
5 3 25
2 3 17
4 3 38
2 5 25
 * @Result
 */
public class Prim2 {
    private static int max = 1000;
    private static int maxVex = 10; //最大顶点数
    private static int maxEdge = 10; //最大边数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顶点的个数和边的个数：");
        int v = sc.nextInt(), e = sc.nextInt();
        int[][] arr = new int[v][v];
        //将图的原始矩阵元素初始化为极大值
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                arr[i][j] = max;
            }
        }
        //输入顶点之间的权值 构建无向图
        System.out.println("请输入起点和终点和起点到终点上的权值：");
        for (int i = 0; i < e; i++) {
            int start = sc.nextInt(), end = sc.nextInt(), weight = sc.nextInt();
            arr[start][end] = weight;
            arr[end][start] = weight;
        }
        prim(arr,v);
    }
    //Prim算法
    private static void prim(int[][] G,int Vnum) {
        int min,tp,minValue = 0;
        int[] adjvex = new int[maxVex]; //存放最短边邻接点下标
        int[] lowcost = new int[maxEdge];   //存放最短边权值
        //将0起始点以外的其他点初始化
        for(int i=1;i<Vnum;i++) {
            lowcost[i] = G[0][i];   //将起点与之有边的权值存入数组	最小权值
            adjvex[i] = 0;  //初始化都为起点的下标	权值都来自于起点0
        }
        for(int i=1;i<Vnum;i++) {
            min = max;    //初始化最小权值为最大值 
            int tp2 = 1;tp = 0;
            while (tp2<Vnum) {
                //权值不为0而且权值小于min	0代表已经加入最小生成树
                if(lowcost[tp2]!=0 && lowcost[tp2]<min) {
                    min = lowcost[tp2]; //更新当前最小权值
                    tp = tp2;   //保存当前最小值顶点下标
                }
                tp2++;
            }
//            System.out.println(adjvex[tp]+" "+tp);  //打印权值最小的边
            minValue+=G[adjvex[tp]][tp];
            lowcost[tp] = 0;    //将当前顶点权值设置为0，该顶点完成任务
            for(int j=1;j<Vnum;j++) {
                //如果下标为tp的顶点的各边权值小于此前这些顶点未被加入生成树的权值
                if(lowcost[j]!=0 && G[tp][j]<lowcost[j]) {
                    lowcost[j] = G[tp][j];
                    adjvex[j] = tp;	//更新最短邻接边
                }
            }
        }
        System.out.println("村村通最低成本为:"+minValue);
    }
}

