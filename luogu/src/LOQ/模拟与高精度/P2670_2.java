package LOQ.模拟与高精度;

import java.util.Scanner;

public class P2670_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String[] line = new String[n];
        //大地雷阵
        String[][] strArray = new String[n+2][m+2];
        //记录地雷阵
        String[][] sar = new String[n][m];
        for (int i = 0; i < n; i++) {  //把数据存放在字符串数组
            line[i] = sc.next();
        }
        for(int i=0;i<n+2;i++) {   //先把整个地雷阵赋值为"!",解决空指针问题
            for(int j=0;j<=m+1;j++) {
                strArray[i][j]="!";
            }
        }
        for(int i=1;i<n+1;i++) {    //把题上给的地雷阵放到大地雷阵中
            String[] sp = line[i-1].split("");
            for(int j=1;j<m+1;j++) {
                strArray[i][j]=sp[j-1];
            }
        }
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                //扫到雷就跳过
                int count = 0;
                if (strArray[i][j].equals("*")) {
                    sar[i-1][j-1] = "*";
                    continue;
                } else {//扫到数字就去扫描自己附近的雷数
                        for (int a = i - 1; a <= i + 1; a++) {
                            for (int b = j-1; b <= j+1; b++) {
                                if (strArray[a][b].equals("*")) {
                                    count++;
                                }
                            }
                        }
                    }
                sar[i-1][j-1] = String.valueOf(count);
            }
        }
        //输出记录地雷阵中的信息
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sar[i][j]);
            }
            System.out.println();
        }
    }
}
