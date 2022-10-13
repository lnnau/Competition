package LOQ.数组;

import java.util.Scanner;

public class P1161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] struct = new int[2000001];//值存放灯的状态  偶数为关闭，奇数为开启
        for (int i = 0; i < n; i++) {
            double a = sc.nextDouble();
            int t = sc.nextInt();
            for (int j = 1; j <= t; j++) {
                double index =  a * j;  //计算的时候先不要强转，灯计算出结果再强转
                struct[(int)index]++;    //灯状态
            }
        }
        //输出为偶数的灯编号
        for (int i = 1; i <= 2000000; i++) {
            if (struct[i] % 2 == 1) {
                System.out.println(i);
                break;
            }
        }
    }
}
