package LOQ.排序;

import java.util.Arrays;
import java.util.Scanner;

public class P1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        //防止数组越界    1001是重复或者无意义数值标识符
        arr[N] = 1001;
        //重复出现次数
        int count = 0;
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        //排序
        Arrays.sort(arr);
        //输出结果
        for(int i=0;i<N;i++) {
            //判断是否重复
            if(arr[i]==arr[i+1]) {
                //将重复值的第一个元素给替换（不用i+1），避免出现2个以上重复值出现的无法判断的问题
                arr[i] = 1001;
                count++;
            }
        }
        System.out.println(N-count);
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=1001) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
