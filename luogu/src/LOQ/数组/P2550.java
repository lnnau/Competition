package LOQ.数组;

import java.util.Scanner;

/*
彩票中奖
 */
public class P2550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();//买了几张彩票
        int[] prize = new int[7];//获奖彩票
        int[] arr = new int[8];//结果
        for(int j=0;j<7;j++) {
            prize[j]=sc.nextInt();
        }
        for(int i=0;i<num;i++) {
            int[] may = new int[7];
            int count=0;
            for(int j=0;j<7;j++) {
                may[j]=sc.nextInt();
            }
            for(int m=0;m<7;m++) {
                for(int n=0;n<7;n++) {
                    if(prize[m]==may[n]) {
                        count++;
                        break;
                    }
                }
            }
            arr[count]++;
        }
        for(int i=7;i>=1;i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
