package LOQ.数组;

import java.util.Scanner;

public class P5732 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输出前n行
        int n=sc.nextInt();
        int[][] arr = new int[21][21];

        for(int i=1;i<=n;i++) {
            arr[i][1]=1;
            arr[i][i]=1;
            for(int j=2;j<=i;j++) {
                //公式
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
            for(int m=1;m<=i;m++) {
                System.out.print(arr[i][m]+" ");
            }
            System.out.println();
        }
    }
}
