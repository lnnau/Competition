package LOQ.模拟与高精度;

import java.util.Scanner;

public class P2670 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String[] line = new String[n];

        for (int i = 0; i < n; i++) {  //把数据存放在字符串数组
            line[i] = sc.next();
        }
        String[][] sar = new String[n][m];
        for (int i = 0; i < n; i++) {
            String[] split = line[i].split("");
            for (int j = 0; j < m; j++) {

                int[] res=new int[3];   //附近地雷数
//                int temp = 0, x1, x2;   //temp当前行所有地雷数，x1当前扫描行标记，x2非地雷所在行标记
                //扫到雷就跳过
                if (split[j].equals("*")) {
                    sar[i][j] = "*";
                    continue;
                } else {//扫到数字就去扫描自己附近的雷数
                    if (i > 0 && i < n - 1) {//中间行
                        for (int a = i - 1; a <= i + 1; a++) {
                            int count = 0;
                            String[] str = line[a].split("");
                            for (int b = 0; b < m; b++) {
                                if (str[b].equals("*")) {
                                    count++;
                                }
                            }
                            int x=a-i+1;
                            if((x==0||x==2)&&count>3) {
                                res[x]=3;
                            } else if(x==1 && x>2) {
                                res[x]=2;
                            } else {
                                res[x]=count;
                            }
                        }
                    } else if (i == 0) {//第一行或者最后一行
                        for (int a = i; a <= i + 1; a++) {
                            int count = 0;
                            String[] str = line[a].split("");
                            for (int b = 0; b < m; b++) {
                                if (str[b].equals("*")) {
                                    count++;
                                }
                            }
                            int x=a-i+1;
                                if((x==0||x==2)&&count>3) {
                                    res[x]=3;
                                } else if(x==1 && x>2) {
                                    res[x]=2;
                                } else {
                                    res[x]=count;
                                }
                            }

                    } else if (i == n - 1) {
                        for (int a = i - 1; a <= i; a++) {
                            int count = 0;
                            String[] str = line[a].split("");
                            for (int b = 0; b < m; b++) {
                                if (str[b].equals("*")) {
                                    count++;
                                }
                            }
                            int x=a-i+1;
                            if((x==0||x==2)&&count>3) {
                                res[x]=3;
                            } else if(x==1 && x>2) {
                                res[x]=2;
                            } else {
                                res[x]=count;
                            }
                        }
                    }
                }
                    sar[i][j] = String.valueOf(res[0]+res[1]+res[2]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sar[i][j]);
            }
            System.out.println();
        }
    }
}
