package LOQ.循环结构;

import java.util.Scanner;

/*
6
1+2+2+3+3+3+4+4+4+4
 */
public class P2669 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num = 0;
        int sum=0;
        //发金币的第i天
        for(int i=1;i<=n;i++) {
            //i天要发数量为i的金币i次
            for(int j=1;j<=i;j++) {
                sum=sum+i;
                num++;
                if(num==n) {
                    System.out.println(sum);
                    return;
                }
            }
        }
    }
}
