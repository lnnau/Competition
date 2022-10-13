package LOQ.数组;

import java.util.Scanner;

/*
拆迁队
 */
public class P1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        int num = sc.nextInt();
        int count=0;
        //0代表有树
        int[] arr = new int[length+1];
        for(int i=0;i<num;i++) {
            int low=sc.nextInt();
            int up=sc.nextInt();
            for(int j=low;j<=up;j++) {
                arr[j]=1;
            }
        }
        for(int i=0;i<=length;i++) {
            if(arr[i]==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
