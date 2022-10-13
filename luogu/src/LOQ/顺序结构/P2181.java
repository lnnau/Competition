package LOQ.顺序结构;
import java.math.BigInteger;
import java.util.*;
public class P2181 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//            String s=sc.nextLine();
//            String s1=Integer.parseInt(s)-1+"";
//            String s2=Integer.parseInt(s)-2+"";
//            String s3=Integer.parseInt(s)-3+"";
            long l = sc.nextLong();

            BigInteger big = BigInteger.valueOf(l).multiply(BigInteger.valueOf(l-1)).multiply(BigInteger.valueOf(l-2)).multiply(BigInteger.valueOf(l-3));
            BigInteger res = big.divide(BigInteger.valueOf(24));
            System.out.println(res);
    }
}
