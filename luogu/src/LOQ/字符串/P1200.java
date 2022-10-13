package LOQ.字符串;
import java.util.Scanner;
/*
    字符串匹配
 */
public class P1200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch1 = sc.next().toCharArray();
        char[] ch2 = sc.next().toCharArray();
        long n1=1;
        long n2=1;
        for(int i=0;i<ch1.length;i++) {
              n1*=ch1[i]-64;
        }
        for(int i=0;i<ch2.length;i++) {
            n2*=ch2[i]-64;
        }
        if(n1%47==n2%47) {
            System.out.println("GO");
        } else {
            System.out.println("STAY");
        }
    }
}
