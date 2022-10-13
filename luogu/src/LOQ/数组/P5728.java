package LOQ.数组;

import java.util.Scanner;

/*
多维数组
 */
public class P5728 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //学生的个数
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        int count=0;
        for(int i=0;i<n;i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
            arr[i][2]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++) {
            int sum1=arr[i][0]+arr[i][1]+arr[i][2];
            for(int j=i+1;j<n;j++) {
                int sum2=arr[j][0]+arr[j][1]+arr[j][2];
                if(Math.abs(arr[i][0]-arr[j][0])<=5 && Math.abs(arr[i][1]-arr[j][1])<=5 &&Math.abs(arr[i][2]-arr[j][2])<=5 &&Math.abs(sum1-sum2)<=10){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
