package LOQ.排序;

import java.util.Scanner;

public class P5143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //二维数组存放三维坐标
        int[][] arr = new int[N][3];
        double resNum = 0;
        for(int i=0;i<N;i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1]=sc.nextInt();
            arr[i][2]=sc.nextInt();
        }
        //从第二个开始，每个坐标的高度z都比前一个高，所有要从小到大排序
        sort(arr);
        for(int i=0;i<N-1;i++) {
            int x = arr[i][0]-arr[i+1][0];
            int y = arr[i][1]-arr[i+1][1];
            int z = arr[i][2]-arr[i+1][2];
            resNum+=Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        }
        System.out.printf("%.3f",resNum);
    }
    static void sort(int[][] arr) {
        int[][] tp1 = new int[1][3];
        boolean flag = true;
        //按照z的大小从小到大排序
        for(int i=0;flag;i++) {
            flag = false;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i][2]>arr[j][2]) {
                    flag = true;
                    tp1[0][0]=arr[i][0];
                    tp1[0][1]=arr[i][1];
                    tp1[0][2]=arr[i][2];
                    arr[i][0]=arr[j][0];
                    arr[i][1]=arr[j][1];
                    arr[i][2]=arr[j][2];
                    arr[j][0]=tp1[0][0];
                    arr[j][1]=tp1[0][1];
                    arr[j][2]=tp1[0][2];
                }
            }
        }
    }
}