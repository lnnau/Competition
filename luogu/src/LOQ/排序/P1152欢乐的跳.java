package LOQ.排序;

import java.util.Scanner;

public class P1152欢乐的跳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        //保存数组的长度
        int len = strs.length-1;
        //标记数组，类似于桶排序
        int[] res = new int[len];
        int[] arr = new int[len];
        for(int i=1;i<=len;i++) {
            arr[i-1] = Integer.parseInt(strs[i]);
        }

        for(int i=0;i<len-1;i++) {
            int tp = Math.abs(arr[i]-arr[i+1]);
            //不符合直接跳过,防止数组越界
            if(tp>len-1)
                break;
            //将出现过的下标中的值置为1
            res[tp] = 1;
        }
        //判断相邻元素之间差的绝对值是否包括了[1,len-1]中的所有整数
        for(int i=1;i<=len-1;i++) {
            if(res[i]==0) {
                //存才未被置换的
                System.out.println("Not jolly");
                return;
            }
        }
        System.out.println("Jolly");
    }
}
