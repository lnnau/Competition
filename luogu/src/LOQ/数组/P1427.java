package LOQ.数组;

import java.util.Scanner;

/*
小鱼的数字游戏
 */
public class P1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int count1=0;
        while(sc.hasNext()) {
            arr[count1]=sc.nextInt();
            if(arr[count1]==0) {
                break;
            }
            count1++;
        }
        for(int i=count1-1;i>=0;i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
