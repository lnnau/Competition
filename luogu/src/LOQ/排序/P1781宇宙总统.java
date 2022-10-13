package LOQ.排序;

import java.math.BigInteger;
import java.util.Scanner;

public class P1781宇宙总统 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        //先把第一个值默认为票数最多
        BigInteger max = sc.nextBigInteger();
        //第一个号数
        long count = 1;
        for(int i=2;i<=n;i++) {
            BigInteger temp = sc.nextBigInteger();
            /*//做减法，然后求余数防止转换整数时数值越界小于0需要交换
            if(max.subtract(temp).doubleValue()<0) {
                max = temp;
                count = i+1;
            }*/
            if((max=max.max((temp))).equals(temp)) {
                //max后和原来的值不相等相等，交换
                count=i;
            }
        }
        System.out.println(count);
        System.out.print(max);
    }
}
