package LOQ.排序;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        System.out.println(Arrays.toString(Merge_Sort(arr, 0, arr.length - 1)));
    }

    /**
     * @param arr   初始数组
     * @param start 开始分组
     * @param end   结束分组
     * @return
     */
    public static int[] Merge_Sort(int[] arr, int start, int end) {
        //当start==end时，此时分组里只有一个元素，所以这是临界点
        if (start < end) {
            //分成左右两个分组，再进行递归
            int mid = (start + end) / 2;
            //左半边分组
            Merge_Sort(arr, start, mid);
            //右半边分组
            Merge_Sort(arr, mid + 1, end);
            //递归之后再归并归并一个大组
            Merge(arr, start, mid, end);
        }
        return arr;
    }

    //归并方法
    public static void Merge(int[] arr, int start, int mid, int end) {
        //左边分组的起点i_start，终点i_end，也就是第一个有序序列
        int i_start = start;
        int i_end = mid;
        //右边分组的起点j_start，终点j_end，也就是第二个有序序列
        int j_start = mid + 1;
        int j_end = end;
        //额外空间初始化，数组长度为end-start+1
        int[] temp=new int[end-start+1];
        int len = 0;
        //合并两个有序序列
        while (i_start <= i_end && j_start <= j_end) {
            //当arr[i_start]<arr[j_start]值时，将较小元素放入额外空间，反之一样
            if (arr[i_start] < arr[j_start]) {
                temp[len] = arr[i_start];
                len++;
                i_start++;
            } else {
                temp[len] = arr[j_start];
                len++;
                j_start++;
            }
            //temp[len++]=arr[i_start]<arr[j_start]?arr[i_start++]:arr[j_start++];
        }

        //i这个序列还有剩余元素
        while(i_start<=i_end){
            temp[len] = arr[i_start];
            len++;
            i_start++;
        }
        //j这个序列还有剩余元素
        while(j_start<=j_end){
            temp[len] = arr[j_start];
            len++;
            j_start++;
        }
        //辅助空间数据覆盖到原空间
        for(int i=0;i<temp.length;i++){
            arr[start+i]=temp[i];
        }
    }
}