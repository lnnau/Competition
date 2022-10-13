package LOQ.循环结构;

import java.util.Scanner;

/*
回文质数
 */
public class P1217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //下界和上界
        int low = sc.nextInt();
        int up = sc.nextInt();
//        //求质数
//        for (int i = low; i <= up; i++) {
//            boolean flag = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag && isPalindrome(i)) {
//                //判断是否是回文质数
//                System.out.println(i);
//            }
        boolean[] flag = getZhi(low,up);
        for(int i=low;i<=up;i++) {
            if(flag[i] && isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean[] getZhi(int low,int up) {
        int max=up;
        boolean[] arr = new boolean[max+1];
        for(int i=low;i<=max;i++) arr[i]=true; //先全部设置为质数，在把不是质数的筛选出去
        for(int i=low;i<max;i++) {
            for(int j=i*2;j<max;j=j+i) {
                arr[j]=false;
            }
        }
        return arr;
    }
    public static boolean isPalindrome(int x) {
        //获取整数的长度
        String s = "" + x;
        int sa = s.length();
        //从末尾获取整数
        int w = 0;
        //后半部分数
        int temp = 0;
        //把小于0的全部抛弃
        if (x < 0) {
            return false;    //小于0的数全部不是回文数
        } else {
            //通过for循环获取整数的后半部分，奇数另说
            for (int i = 1; i <= sa / 2; i++) {
                w = x % 10;    //得到当前x的最后一位数
                temp = temp * 10 + w;    //把当前x拼接成数
                x = x / 10;    //x去掉末尾的数
            }
            //如果是奇数，就把中间的那个数去掉（多做一次除法），只用比较前半部分和后半部分
            if (sa % 2 != 0) {
                x = x / 10;
            }
            if (temp == x) {
                return true;
            } else {
                return false;
            }
        }
    }
}



