package com.backtrack;
import java.util.*;
/**
 * @Author Lunau
 * @Create 2022-03-12 16:20
 * @Description
 * @Result
 *  1    2    3
 *
 */
public class BackTrack {
    //存储全排列的结果
     static  List<List<Integer>> res = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //表示要输出1~n组成的所有全排列
        int num = sc.nextInt();
        //记录路径
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(num,track);
        //输出结果
        for(List<Integer> ls:res) {
            for(Integer i:ls) {
                System.out.print("    "+i);
            }
            System.out.println();
        }
    }
    //回溯算法框架
    private static void backtrack(int num, LinkedList<Integer> track) {
        //到达叶子节点，将路径装入结果列表
        if(track.size()==num) {
            res.add(new LinkedList<>(track));
            //该层递归结束，返回到上一层递归
            return;
        }

        for(int i=1;i<=num;i++) {
            //排序不合法的选择，也就是前面已经被选择过的排除掉
            if(track.contains(i))
                continue;
            //做选择，把符合的装入集合
            track.add(i);
            //进入下一层决策树
            backtrack(num,track);
            //回溯，取消已经选择的
            track.removeLast();
        }
    }
}
