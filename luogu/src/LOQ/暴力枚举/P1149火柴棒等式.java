package LOQ.暴力枚举;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-11 14:31
 * @Description
 */
public class P1149火柴棒等式 {
    //索引为0-9，值为该数字需要的火柴棒数
    static  int[] arr = {6,2,5,5,4,5,6,3,7,6};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-4; //剩余的火柴棒
        int[] form =  new int[1501];
        form[0] = 6;
        for (int i=1;i<1501;i++) {
            int j=i;
            //打表，求余求大于9的数的火柴棒数
            while (j>=1) {
                form[i] = form[i]+arr[j%10];
                j/=10;
            }
        }
        int count = 0;
        for (int i=0;i<=750;i++) {
            for (int j=0;j<=750;j++) {
                int res = n-form[i]-form[j];  //剩余火柴数
                if (res==form[i+j]) {
                    count++;
//                    System.out.println(i+" "+j);
                }
            }
        }
        System.out.println(count);
    }
}
