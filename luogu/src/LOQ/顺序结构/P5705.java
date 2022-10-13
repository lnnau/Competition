package LOQ.顺序结构;

import java.util.Scanner;

public class P5705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(sc.nextDouble());
        sb.reverse();

        System.out.println(sb.toString());
    }
}
