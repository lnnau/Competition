package LOQ.暴力枚举;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-12 16:35
 * @Description
 */
public class P3799妖梦拼木棒 {
    static List<List<Integer>> res = new LinkedList<>();
    static LinkedList<Integer> path = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        BackTrack(n,4,0,arr);
        //循环遍历组合集合
        Iterator<List<Integer>> iterator = res.iterator();
        while (iterator.hasNext()) {
            List<Integer> list = iterator.next();   //四个数组成的集合
            Integer a = list.get(0);
            Integer b = list.get(1);
            Integer c = list.get(2);
            Integer d = list.get(3);
            if ((a+b==c&&c==d)||(a+c==b&&c==d)||(a+d==c&&b==c)||(b+c==a&&a==d)
            ||(b+d==a&&a==c)||(c+d==a&&a==b)) {
                count++;
                count%=(10e9+7);
            }
        }
        System.out.println(count);
    }
    //n从n个数中取，r要取出r个数构成集合 start 开始取的位置，arr 数组
    private static void BackTrack(int n,int r,int start,int[] arr) {
        //到达叶子节点，得到一个r个数组成的组合
        if (path.size()==r) {
            res.add(new LinkedList<>(path));
            return;
        }

        for (int i=start;i<n;i++) {
            path.add(arr[i]);
            BackTrack(n,r,i+1,arr);
            path.removeLast();
        }
    }
}
