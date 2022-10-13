package LOQ.排序;

import java.util.Scanner;

//选举学生会
public class P1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        bucketSort(arr,n);
//        for(int i=0;i<arr.length;i++) {
//            System.out.print(arr[i]+" ");
//        }
    }
    //冒泡排序
    public static int[] bubbleSort(int[] arr) {
        int temp = 0;
        for(int i=0;i<arr.length-1;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
    //桶排序
    public static void bucketSort(int[] arr,int n) {
        int[] arrays = new int[n+1];
        for(int i=0;i<arr.length;i++) {
            arrays[arr[i]]++;
        }
        for(int i=1;i<arrays.length;i++) {
            for(int j=0;j<arrays[i];j++) {
                System.out.print(i+" ");
            }
        }
    }
}
