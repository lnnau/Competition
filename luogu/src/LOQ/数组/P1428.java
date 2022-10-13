package LOQ.数组;

import java.util.Scanner;

/*
小鱼比可爱
    通过数组控制每条鱼的可爱程度
    循环比较每条鱼前边的可爱程度，比自己小的就把计数器加一
 */
public class P1428 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            int count=0;
            for(int j=0;j<i;j++) {
                if(arr[i]>arr[j]) {
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}
