package com.byeEnd;
import java.util.Scanner;
/**
 * @Author Lunau
 * @Create 2022-05-21 9:03
 * @Description
 * @Result
6
-2 11 -4 13 -5 -2
 */
public class MaxProfit {
    private static String resStr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        //蛮力法
        bruteForce(arr);
//        System.out.println(maxSubSum(arr));
//        System.out.println(divideMethod(arr,0,n-1));
//        System.out.println(dpMethod(arr));
    }
    //动态规划
    public static int dpMethod(int[] arr) {
        int len = arr.length;
        int[] dp = new int[len];
        int max = 0;
        dp[0] = arr[0]; //初始化
        for(int i=1;i<len;i++) {
            dp[i] = Math.max(dp[i-1]+arr[i],arr[i]);
            max = Math.max(max,dp[i]);  //更新当前最大连续子段和
        }
        return max;
    }
    //分治法（递归方法求解）
    public static int divideMethod(int arr[],int low,int high){
        int center = low + (high-low)/2;
        int maxLeftSum,maxRightSum;     //分别表示左右最大字段和
        int borLeftSum,borRightSum;     //分别表示在center左右的最大字段和

        if(low == high){
            if(arr[low] > 0)
                return arr[low];
            else
                return 0;
        }

        maxLeftSum = divideMethod(arr,low,center);
        maxRightSum = divideMethod(arr,center+1,high);

        //求解交界部分的最大值，并与左右部分比较得出最大子段和
        borLeftSum = 0;
        borRightSum = 0;
        int tempSum = 0;
        for (int i = center; i <= high; i++) {	//往右找出最大子段和
            tempSum += arr[i];
            if(tempSum > borRightSum){
                borRightSum  = tempSum;
            }
        }
        tempSum = 0;
        for (int i = center; i >= low; i--) {	//往左找出最大子段和
            tempSum += arr[i];
            if(tempSum > borLeftSum){
                borLeftSum  = tempSum;
            }
        }
        //比较左，右，交界处的子段和得出最大字段和
        int maxSum = Math.max(maxLeftSum,maxRightSum);
        maxSum = Math.max(maxSum,borLeftSum+borRightSum-arr[center]);
        return maxSum;
    }

    public static int maxSubSum(int[] a) {
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            int tempSum = 0;
            for (int j = i; j < a.length; j++) {
                tempSum += a[j];
                if (tempSum > maxSum) {	 //判断最大值
                    maxSum = tempSum;
                }
            }}
        return maxSum;
    }

    //蛮力法
    public static void bruteForce(int[] arr) {
        int len = arr.length;
        int[][] res = new int[len][len];    //保存所有的求和结果
        String[][] strs = new String[len][len]; //保存所选元素坐标
        //n种穷举方式
        for(int i=0;i<len;i++) {
            //使用某种遍历方式去累加
            for(int j=0;j<len-i;j++) {
                int sum = 0;
                strs[i][j] = "";    //去除null
                //从j到j+i+1进行连续求和
                for(int m=j;m<j+i+1;m++) {
                    sum+=arr[m];
                    strs[i][j] += m+",";
                }
                res[i][j] = sum;
            }
        }
        //输出结果,记录构成坐标
        int max = -1,p = -1,q = -1;
       for(int i=0;i<len;i++) {
           for(int j=0;j<len;j++) {
               if (res[i][j]>max) {
                   max = res[i][j];
                    p = i;q = j;
               }
           }
       }
        System.out.println(max);
       if (max==0)
           return;
       //输出最大连续字段和由那些元素组成
        String[] str = strs[p][q].split(",");
        for(int i=0;i<str.length;i++) {
            System.out.print(arr[Integer.parseInt(str[i])]+" ");
        }
    }
}
