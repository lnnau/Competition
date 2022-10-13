package LOQ.暴力枚举;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-07 22:30
 * @Description
 */
public class P1088火星人02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m = sc.nextInt();
        int[] arr = new int[n];   //避免越界
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int j,q=0;
        //需要迭代的次数
        for (int i=0;i<m;i++) {
            //从序列末尾向前寻找arr[i]<arr[i+1]
            for (j=n-2;j>=1;j--) {
                //符合条件，跳出循环,当前arr[j]为左边靠右较小数
                if (arr[j]<arr[j+1]) {
                    break;
                }
            }
            //从右寻找较大数
            for (q=n-1;q>j;q--) {
                if (arr[q]>arr[j]) {
                    break;
                }
            }
            //交换左边靠右的较小数和右边的较大数
            swap(arr,j,q);
            //将j+1到n-1之间的数从降序变为升序
            j++;q=n-1;
            while (j<q) {
                swap(arr,j,q);
                j++;
                q--;
            }
            System.out.println(Arrays.toString(arr));
        }
        //输出序列
        System.out.print(""+arr[0]);
        for (int i=1;i<n;i++) {
            System.out.print(" "+arr[i]);
        }
    }
    private static void swap(int[] arr,int p,int q) {
        int tp = arr[p];
        arr[p] = arr[q];
        arr[q] = tp;
    }
}
