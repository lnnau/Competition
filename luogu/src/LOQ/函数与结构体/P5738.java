package LOQ.函数与结构体;

import java.util.Arrays;
import java.util.Scanner;

public class P5738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double[] array = new double[n];
        for(int i=0;i<n;i++) {
            //存放评委给一位同学的打分
            double[] arr = new double[m];
            for(int j=0;j<m;j++) {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            double sum=0;
            for(int s=1;s<m-1;s++) {
                sum+=arr[s];
            }
            array[i]=sum/(m-2);
        }
        double max=0;
        for(int i=0;i<n;i++) {
            if(array[i]>max) {
                max=array[i];
            }
        }
        System.out.printf("%.2f",max);
    }
}
