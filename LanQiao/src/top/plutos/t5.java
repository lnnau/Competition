package top.plutos;

import java.math.BigInteger;
import java.util.Scanner;

public class t5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        BigInteger tp = new BigInteger("1");
        for(long i=2;;i++) {
            BigInteger res = new BigInteger("0");
            tp=tp.multiply(new BigInteger(""+i));
            char[] ch = tp.toString().toCharArray();
            long count = 1L;
            for(int j=ch.length-1;j>=0;j--) {
                if(ch[j]=='0') {
                    if (ch[j]=='0'&&ch[j]==ch[j-1]) {
                        count++;
                    }
                    if(count==num) {
                        System.out.println(i);
                        return;
                    }
                } else {
                    break;
                }

            }
        }
    }
}
