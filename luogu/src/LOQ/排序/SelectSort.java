package LOQ.排序;

public class SelectSort {
    public static void main(String[] args) {
        long start =System.currentTimeMillis();
        int[] arr = {6,4,2,1,3,9,7,2};
        //调用方法
        selectSort(arr);
        for(int i:arr)
            System.out.print(i+" ");
        long end = System.currentTimeMillis();
        System.out.println(end-start+"毫秒");
    }
    public static void selectSort(int[] arr) {
        //循环次数，每次都在已排序序列中增加一个元素
        for(int i=0;i<arr.length-1;i++) {
            //把当前未排序元素值作为最最值
            int min = i;
            //寻找当前未排序序列中的最小值
            for(int j=i;j< arr.length;j++) {
                if(arr[j]<arr[min]) {
                    min=j;
                }
                //将找到的最小值插入已排序列中
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}
