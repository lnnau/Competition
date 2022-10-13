package LOQ.模拟与高精度;

import java.util.Scanner;

/**
 *
 */
public class P1563 {
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
            String[] temp = pepos[(index) % (n - 1)].split(" ");  //从第一个小人开始
            String[] order = orders[i].split(" ");    //获取指令
            if (order[0].equals("0")) {  //向左
                if (temp[0].equals("0")) {   //圈内    左为顺时针
                    index = Math.abs((index + n - Integer.parseInt(order[1])) % (n-1));
                } else {    //圈外 左为逆时针
                    index = Math.abs((index + Integer.parseInt(order[1])) % n);
                }
            } else {    //向右
                if (temp[0].equals("0")) {   //圈内    右为逆时针
                    index = Math.abs((index + Integer.parseInt(order[1])) % n);
                } else {    //圈外 右为顺时针
                    index = Math.abs((index + n - Integer.parseInt(order[1])) % (n-1));
                }
            }
//            if(index==0) index++;
        }
        String[] res = pepos[index].split(" ");
        System.out.println(res[1]);
    }
}
