package LOQ.排序;

public class BubbleSort {
    public static void main(String[] args) {
        long start =System.currentTimeMillis();
        int[] arr = {6,4,2,1,3,9,7,2,66};
        bubbleSort(arr);
        for(int i:arr) {
            System.out.print(i+" ");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start+"毫秒");
    }
    //伪装冒泡排序 其实是选择排序 仔细一点看看
    public static void bubbleSort(int[] arr) {
        int temp = 0;
        boolean flag = true;
        for(int i=0;flag;i++) {
            flag=false;
            for(int j=i+1;j<arr.length;j++) {
                //从小到大排序
                if(arr[i]>arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    //已经排列好的序列位置
                    flag=true;
                }
            }
        }
    }
}
