package LOQ.暴力枚举;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * @Author Lunau
 * @Create 2022-10-04 16:41
 * @Description
 */
public class P1157组合数的输出 {
    static List<List<Integer>> res = new LinkedList<>();
    static LinkedList<Integer> path = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        BackTrack(n,r,1);
        for (List<Integer> list : res) {
            for (Integer i : list) {
                System.out.printf("%3d",i);
            }
        }
    }
    private static void BackTrack(int n,int r,int start) {
        //到达叶子节点，得到一个r个数组成的组合
        if (path.size()==r) {
            res.add(new LinkedList<>(path));
            return;
        }

        for (int i=start;i<=n;i++) {
            path.add(i);
            BackTrack(n,r,i+1);
            path.removeLast();
        }
    }
}
