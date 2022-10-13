package LOQ.暴力枚举;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-09-07 9:29
 * @Description
 * @Result
 */
public class P2241统计方形 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        //sum1 正方形数，sum2矩形数
        long sum1 = 0,sum2 = 0;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=m;j++) {
                sum1 += Math.min(i,j);
                sum2 += i * j;
            }
        }
        System.out.println(sum1+" "+(sum2-sum1));
    }
}
