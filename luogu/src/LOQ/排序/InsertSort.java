package LOQ.排序;
//插入排序
public class InsertSort {
    private static int count = 1;
    public static void main(String[] args) {
        int[] arr = {2,45,5,1,4,5,7};
        //调用方法
        insertSort(arr);
        for(int i:arr) {
            System.out.print(i+" ");
        }
    }
    private static void insertSort(int[] arr) {
        int i,j,temp;
        for(i=1; i<arr.length; i++) {
            //暂存当前需要排序元素
            temp = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>temp) {
                //从小到大排序，把大的放后边
                arr[j+1] = arr[j];
                //j往左移动，寻找比temp大的元素，继续交换
                j--;
            }
            //j到头或者找到小于temp的，需要把temp插入
            arr[j+1] = temp;
            trace(arr);
        }
    }
    //输出每次排序后的结果
    private static void trace(int[] arr) {
        System.out.print("第"+count+"次");
        for(int i:arr) {
            System.out.print(" "+i+" ");
        }
        count++;
        System.out.println();
    }
}
