package LOQ.排序;

import java.util.Scanner;

public class P1923 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
//        int[] arr = new int[100000000];
//        for(int i=0;i<n;i++) {
//            int tp = sc.nextInt();
//            arr[tp]++;
//        }
//        int flag = -1;
//        for(int i=0;;i++) {
//            if(arr[i]>=1) {
//                flag++;
//            }
//            if(flag==k) {
//                System.out.println(i);
//                break;
//            }
//        }
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);
        System.out.println(arr[k]);
    }
    private static void quickSort(int[] arr, int lowIndex, int highIndex) {
        //符合条件
        if(lowIndex>=highIndex) {
            return;
        }
        //待排序序列取第一个值为中枢
        int pivot = arr[lowIndex];
        int low = lowIndex,high = highIndex;
        //从左右两端交替扫描，直到low=high,说明这段待排序序列分成两段
        while (low < high) {
            //从右往左扫描，直到找到第一个比基准小的元素
            while (low < high && arr[high] >= pivot) {
                high--;
            }
            //将找到的元素放到左边
            arr[low]=arr[high];

            while (low<high && arr[low] <=pivot) {
                low++;
            }
            arr[high]=arr[low];

        }
        //基准值恢复
        arr[low] = pivot;
        //基准值左边进行递归排序
        quickSort(arr,lowIndex,low-1);
        quickSort(arr,high+1,highIndex);
    }
}
