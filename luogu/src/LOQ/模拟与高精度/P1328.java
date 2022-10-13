package LOQ.模拟与高精度;

import java.util.Scanner;

public class P1328 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
        //整型数组存放a和b的出拳
        int[] aArray = new int[a];
        int[] bArray = new int[b];
        for(int i=0;i<a;i++) {
            aArray[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++) {
            bArray[i]=sc.nextInt();
        }
        //结果集
        int[][] res={
                {0,0,1,1,0},
                {1,0,0,1,0},
                {0,1,0,0,1},
                {0,0,1,0,1},
                {1,1,0,0,0}
        };
        int ares=0,bres=0;
        for(int i=0;i<n;i++) {
            if(res[aArray[i%a]][bArray[i%b]]==1) {
                ares++;
            } else if(res[aArray[i%a]][bArray[i%b]]==0 && aArray[i%a]!=bArray[i%b]) {
                //当a和b结果相同，也就是平局时的结果需要被筛选出去
                bres++;
            }
        }
        System.out.println(ares+" "+bres);
    }
}
