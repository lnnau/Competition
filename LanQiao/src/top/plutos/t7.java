package top.plutos;

import java.util.Arrays;
import java.util.Scanner;

public class t7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;  //每个单独的数特判
        for(int i=0;i<N;i++) {
            for(int j=i+1;j<N;j++) {
                int[] tp = new int[j-i+1];
                for(int m=0;m<tp.length;m++) {
                    tp[m]=arr[m+i];
                }
                Arrays.sort(tp);

                if (tp.length>1&&tp[1]-tp[0]==1) {
                    count++;
                    count%=1000000007;
                }
            }
        }
        System.out.println(count);
    }
}
