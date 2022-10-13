package LOQ.模拟与高精度;

import java.util.Scanner;

public class P1563_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        String[] pepos = new String[n]; //小人个数及朝向
        String[] orders = new String[m];  //指令
        sc.nextLine();  //吃掉回车符
        int index = 0;    //记录当前指向小人坐标
        for (int i = 0; i < n; i++) {
            pepos[i] = sc.nextLine();
        }
        for (int i = 0; i < m; i++) {
            orders[i] = sc.nextLine();
        }

        for (int i = 0; i < m; i++) {
            String[] temp = pepos[index].split(" ");  //从第一个小人开始
            String[] order = orders[i].split(" ");    //获取指令
            //顺时针
            if ((order[0].equals("0") && temp[0].equals("0")) || (order[0].equals("1") && temp[0].equals("1"))) {
                index = (index + n - Integer.parseInt(order[1])) % n;
            } else {    //逆时针
                index = (index + Integer.parseInt(order[1])) % n;
            }
        }
        String[] res = pepos[index].split(" ");
        System.out.println(res[1]);
    }
}
