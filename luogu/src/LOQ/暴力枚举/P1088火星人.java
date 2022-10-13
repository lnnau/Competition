package LOQ.暴力枚举;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-04 20:19
 * @Description
 */
public class P1088火星人 {
    static List<List<Integer>> res = new LinkedList<>();
    static LinkedList<Integer> path = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
//        str+=" ";   //便于匹配字符串
        backTrack(n, m);
        //遍历寻找火星人手指位置
/*        int count=0;
        for (List<Integer> list : res) {
            String tp = "";
            for (Integer i : list) {
                tp+=i+" ";
            }
            count++;    //记录遍历次数
            if (count==m) {
                System.out.println(tp);
            }
            //找到起始点，重置遍历次数，等待输出
            if (tp.equals(str)) {
                count=0;
            }
        }*/
        System.out.println(res);

    }

    //求全排列
    private static void backTrack(int num, int m) {
        if (path.size() == num) {
            res.add(new LinkedList<>(path));
            return;
        }
        for (int i = 1; i <= num; i++) {
            //排除已经添加的
            if (path.contains(i)) {
                continue;
            }
            path.add(i);
            //进入下一层决策树
            backTrack(num, m);
            path.removeLast();
        }
    }
}

