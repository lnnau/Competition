package LOQ.暴力枚举;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Lunau
 * @Create 2022-10-04 11:20
 * @Description 求组合数+判断素数
 * @Result
 */
public class P1036选数 {
    static List<List<Integer>> res = new LinkedList<>();    //最终结果集
    static LinkedList<Integer> path = new LinkedList<>();   //中间一次结果集

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //几个数
        int k = sc.nextInt();   //k个数组合
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        //求出所有组合数
        BackTrack(n,k,0,arr);
        System.out.println(res.toString());
        //求组合数的和
        List<Integer> sumList = new LinkedList<>();
        for (List<Integer> list : res) {
            int sum = 0;
            for (Integer integer : list) {
              sum+=integer;
            }
            sumList.add(sum);
        }
        //判断是否是素数
        int count = 0;
        for (Integer i : sumList) {
            if (getPrimer(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
    //回溯求组合数
    private static void BackTrack(int n,int k,int start,int[] arr) {
        //到达叶子节点，得到了k个数组成的组合
        if (path.size()==k) {
                res.add(new LinkedList<>(path)); //添加的是引用，所以用new的方式添加
                return;
        }
        for (int i = start;i<n;i++) {
            path.add(arr[i]);   //添加到中间结果集
            BackTrack(n,k,i+1,arr); //i+1从下一个节点开始递归
            path.removeLast();  //去除上次的结果
        }
    }

    //求素数
    private static Boolean getPrimer(int num) {
        boolean flag = true;
        for (int i=2;i<num;i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
}
