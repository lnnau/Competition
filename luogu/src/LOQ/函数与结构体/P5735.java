package LOQ.函数与结构体;

import java.util.Scanner;

public class P5735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double[] arr = new double[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextDouble();
        }
        sum += getLength(arr[0], arr[1], arr[2], arr[3]);
        sum += getLength(arr[0], arr[1], arr[4], arr[5]);
        sum += getLength(arr[2], arr[3], arr[4], arr[5]);
        System.out.printf("%.2f",sum);
    }

    //二维平面下求两点间距离方法
    private static double getLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
