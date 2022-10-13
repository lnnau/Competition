package top.plutos;

import java.util.Scanner;

public class t6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(),M = sc.nextInt();
        int[][] arr = new int[N][M];
        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int lim = sc.nextInt();
        int min = 10000,max = -1,res=0,yyds=0;
        for(int i=0;i<M;i++) {
            for(int j=0;j<N;j++) {
                if(arr[j][i]>max) {
                    max = arr[j][i];
                }
                if(arr[j][i]<min) {
                    min = arr[j][i];
                }
                res=(i+1)*(j+1);
                if(max-min<=lim && res>yyds) {
                    yyds = res;
                }
            }
        }
        System.out.println(yyds);
    }
}
