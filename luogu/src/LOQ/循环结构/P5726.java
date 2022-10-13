package LOQ.循环结构;

import java.util.Scanner;

public class P5726 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt(); //整数个数
        int min=1000;
        int max=0;
        for(int i=0;i<n;i++) {
            int temp = sc.nextInt();
            if(temp<min) {
                min=temp;
            }else if(temp>max) {
                max=temp;
            }
        }
        System.out.println(max-min);
    }
}
