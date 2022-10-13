package LOQ.模拟与高精度;

import java.util.Scanner;

public class P1518 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int direction1 = 0; //牛的移动方向
        int direction2 = 0; //猎人方向
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;   //牛和猎人的坐标
        int count = 0;    //寻找的时间
        String[][] map = new String[10][10];    //地图
        for (int i = 0; i < 10; i++) {
            String[] str = sc.nextLine().split("");
            for (int j = 0; j < 10; j++) {
                map[i][j] = str[j];   //造地图;
                if (str[j].equals("C")) {    //记录牛和人起始坐标
                    x1 = i;
                    y1 = j;
                }
                if (str[j].equals("F")) {
                    x2 = i;
                    y2 = j;
                }
            }
        }
        while ((x1 != x2) || (y1 != y2)) { //牛和人的坐标不相等时，继续寻找
            if (count > 1000) break;
            if (direction1 == 0) {  //牛的移动
                if (x1 - 1 < 0 || map[x1 - 1][y1].equals("*")) {   //碰到障碍物或者要超出地图边界时移动方向
                    direction1 = (direction1 + 1) % 4;
                } else {
                    x1--;
                }
            } else if (direction1 == 1) {
                if (y1 + 1 > 9 || map[x1][y1 + 1].equals("*")) {
                    direction1 = (direction1 + 1) % 4;
                } else {
                    y1++;
                }
            } else if (direction1 == 2) {
                if (x1 + 1 > 9 || map[x1 + 1][y1].equals("*")) {
                    direction1 = (direction1 + 1) % 4;
                } else x1++;
            } else {
                if (y1 - 1 < 0 || map[x1][y1 - 1].equals("*")) {
                    direction1 = (direction1 + 1) % 4;
                } else {
                    y1--;
                }
            }

            if (direction2 == 0) {  //人的移动
                if (x2 - 1 < 0 || map[x2 - 1][y2].equals("*")) {   //碰到障碍物
                    direction2 = (direction2 + 1) % 4;
                } else {
                    x2--;
                }
            } else if (direction2 == 1) {
                if (y2 + 1 > 9 || map[x2][y2 + 1].equals("*")) {
                    direction2 = (direction2 + 1) % 4;
                } else {
                    y2++;
                }
            } else if (direction2 == 2) {
                if (x2 + 1 > 9 || map[x2 + 1][y2].equals("*")) {
                    direction2 = (direction2 + 1) % 4;
                } else x2++;
            } else {
                if (y2 - 1 < 0 || map[x2][y2 - 1].equals("*")) {
                    direction2 = (direction2 + 1) % 4;
                } else {
                    y2--;
                }
            }
            count++;    //牛和人同时移动一次或转向，时间加一
        }
        if (x1 == x2 && y1 == y2) {
            System.out.println(count);
        } else {
            System.out.println("0");
        }
    }
}
