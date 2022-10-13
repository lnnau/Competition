package LOQ.排序;

import java.util.Scanner;
//求冒泡排序实际交换的次数
public class P1116车厢重组 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(bubbleSort(arr));
    }
    //冒泡排序
    public static int bubbleSort(int[] arr) {
        int temp = 0;
        int sw = 0;
        boolean flag = true;
        for(int i=0;flag;i++) {
            flag=false;
            for(int j=i+1;j<arr.length;j++) {
                //从小到大排序
                if(arr[i]>arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    sw++;
                    flag=true;
                }
            }
        }
        return sw;
    }
}
