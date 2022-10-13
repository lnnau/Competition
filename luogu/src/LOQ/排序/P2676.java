package LOQ.排序;

import java.util.Arrays;
import java.util.Scanner;

public class P2676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        int highSum = 0;
        //统计奶牛塔中最少的奶牛数
        int count = 0;
        int[] arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i]=sc.nextInt();
        }
        //从小到大对奶牛的身高排序
        Arrays.sort(arr);
        for(int i=N-1;i>=0;i--) {
            count++;
            //对奶牛的身高进行求和
            highSum+=arr[i];
            if(highSum>=B) {
                break;
            }
        }
        System.out.println(count);
    }
}
