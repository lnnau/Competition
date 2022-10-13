package LOQ.循环结构;

import java.math.BigInteger;
import java.util.Scanner;

public class P1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        BigInteger sum = new BigInteger("0");
        BigInteger temp = new BigInteger("1");
        for(long i=1;i<=num;i++) {
            temp=temp.multiply(BigInteger.valueOf(i));
            sum=sum.add(temp);
        }
//        System.out.printf("%.0f",sum);
        System.out.println(sum);
    }
}
