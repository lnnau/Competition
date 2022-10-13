package com.greedy;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-05-13 11:53
 * @Description
 * @Result
 */
public class knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入背包容量和物品个数");
        int cap = sc.nextInt();
        int num = sc.nextInt();
        System.out.println("请输入背包重量和价值（空格隔开）:");
        int[] w = new int[num];
        int[] v = new int[num];
        for(int i=0;i<num;i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        System.out.printf("放入背包的最大价值是：%.2f",getMaxValue(w, v, cap));
    }
    private static double getMaxValue(int[] w,int[] v,int cap) {
        int len = w.length;
        //得到价值比 价值比和物品重量
        double[][] goods = new double[len][2];
        System.out.println("排序前");
        for(int i=0;i<len;i++) {
            double ratio = (double) v[i]/w[i];
            System.out.printf("%d %d %.2f\n",w[i],v[i],ratio);
            goods[i][0] = ratio;
            goods[i][1] = w[i];
        }
        //对价值比进行排序
        Arrays.sort(goods,new Comparator<double[]>(){
            public int compare(double[] a,double[] b) {
                return a[0]-b[0]>=0?1:-1;
            }
        });
        double max = 0;
        double[] res = new double[len]; //放入背包的物品
        //遍历物品，价值比最大的优先加入背包，物品可拆分
        System.out.println("从小到大排序后");
        for(int i=len-1;cap>0&&i>=0;i--) {
            double mv = goods[i][0];
            double w1 = goods[i][1];
            double v1 = goods[i][0]*goods[i][1];
            System.out.printf("%.1f %.1f %.2f\n",w1,v1,mv);
            if(goods[i][1]<cap) {	//可以放入背包
                max += v1;
                cap-=w1;
                res[i] = 1;
            } else {
                //物品放不入背包，对物品进行拆分
                max +=((double)cap/w1)*v1;
                res[i] = (double) cap/w1;
                cap = 0;
            }
        }
        //输出放入背包的物品
        System.out.println("单位价值大的在后面"+Arrays.toString(res));
        return max;
    }
}

