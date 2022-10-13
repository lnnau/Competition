package LOQ.暴力枚举;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-08 10:26
 * @Description 遍历区域分界线，寻找最小变化的色块 count需要置为0
 */
public class P3392涂国旗_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String[][] strs = new String[n][m];
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            strs[i] = s.split("");
        }

        int min = Integer.MAX_VALUE;
        //遍历白色区域可能的边界行,去掉最后的一行和倒数第二行
        for (int i = 0; i < n - 2; i++) {
            //遍历蓝色区域可能的边界行，去掉倒数第一行
            for (int j = i + 1; j < n-1 ; j++) {
                int count = 0;
                //分别遍历三个区域
                for (int a = 0; a < n; a++) {  //行
                    for (int tp = 0; tp < m; tp++) { //列
                        if (a<=i) {
                            if (!strs[a][tp].equals("W")) {
                                count++;
                            }
                        } else if (a<=j) {
                            if (!strs[a][tp].equals("B")) {
                                count++;
                            }
                        } else {
                            if (!strs[a][tp].equals("R")) {
                                count++;
                            }
                        }
                    }
                }
                min = Math.min(min, count);
            }
        }
        System.out.println(min);
    }
}
