package LOQ.递推与递归;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 找规律 类斐波那契数列
 * 由于是高精度，需要用大数，单纯递归不能解决问题
 */
public class P1255数楼梯 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if(num==1 || num==2) {
            System.out.println(num);
            return;
        }
        //已知的前两个数
        BigInteger big1 = new BigInteger("1");
        BigInteger big2 = new BigInteger("2");
        //结果
        BigInteger res = new BigInteger("0");
        for(int i=2;i<num;i++) {
            res = big1.add(big2);
            big1 = big2;
            big2=res;
        }
        System.out.println(res);
    }
    /*private static int countStair(int num) {
        //递归出口
        if(num==1)
            return 1;
        else if(num==2)
            return 2;
        else {
            //递推公式
            return countStair(num-1)+countStair(num-2);
        }
    }*/
}
