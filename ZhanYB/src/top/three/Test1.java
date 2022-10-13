package top.three;

import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-05-11 19:47
 * @Description
 * @Result
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] strs = new String[n][m];
        sc.nextLine();
        //输入地图
        for(int i=0;i<n;i++) {
            strs[i] = sc.nextLine().split("");
        }
        int count=0;
        //遍历地图 边界不需要遍历
        for(int i=1;i<n-1;i++) {
            for(int j=1;j<m-1;j++) {//&&strs[i][j+1].equals("#")
                if(strs[i][j].equals("#") && strs[i][j-1].equals("*")&&strs[i-1][j].equals("*")&&strs[i+1][j].equals("*")) {
                    count++;
                } else {
                    continue;
                }
            }
            System.out.print(count);
        }
    }
}
