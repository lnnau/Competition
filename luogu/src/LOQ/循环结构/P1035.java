package LOQ.循环结构;

import java.util.Scanner;

public class P1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        double n=1;
        double temp=0;
        double sum=0;
        while(sum<=k) {
            temp=1/n;
            sum=sum+temp;
            ++n;
        }
        System.out.printf("%.0f",n-1);
    }
}
