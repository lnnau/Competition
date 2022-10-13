package LOQ.模拟与高精度;

import java.math.BigInteger;
import java.util.Scanner;

public class P1601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new  BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        BigInteger res = a.add(b);
        System.out.println(res);
    }
}
