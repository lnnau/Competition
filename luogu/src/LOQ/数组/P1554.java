package LOQ.数组;

import java.util.Scanner;

/*
梦中的统计
 */
public class P1554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        int[] arr=new int[10];
        for(int i=M;i<=N;i++) {
            String len = ""+i;
            int temp=i;
            while(temp!=0){
                arr[temp%10]++;
                temp=temp/10;
            }
        }
        for(int i=0;i<=9;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
