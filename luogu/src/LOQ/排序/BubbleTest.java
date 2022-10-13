package LOQ.排序;

public class BubbleTest {
    public static void main(String[] args) {
        int[] arr = {6,4,2,1,3,9,7,2,66};
        bubbleTest04(arr);
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
    //j从小到大，排列从小到大
    static void bubbleTest01(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            //每次循环确定一个最大值
            for(int j=0;j<n-1-i;j++) {
                //从小到大排序
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];    //大的暂存起来
                    arr[j] = arr[j+1];    //小的给大的
                    arr[j+1] = temp;    //大的放后面
                }
            }
        }
    }
    //j从小到大，排列从大到小
    static void bubbleTest02(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            //每次循环确定一个最小值
            for(int j=0;j<n-1-i;j++) {
                //从大到小排序
                if(arr[j]<arr[j+1]) {
                    int temp = arr[j];    //大的暂存起来
                    arr[j] = arr[j+1];    //小的给大的
                    arr[j+1] = temp;    //大的放后面
                }
            }
        }
    }

    //j从大到小，排列从小到大
    static void bubbleTest03(int[] arr) {
        int n = arr.length;
        for(int i=n-1;i>0;i--) {
            //每次循环确定一个最小值
            for(int j=n-1;j>n-i-1;j--) {
                //从小到大
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    //j从大到小，排列从大到小
    static void bubbleTest04(int[] arr) {
        int n = arr.length;
        for(int i=n-1;i>0;i--) {
            //每次循环确定一个最小值
            for(int j=n-1;j>n-i-1;j--) {
                //从小到大
                if(arr[j]>arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
