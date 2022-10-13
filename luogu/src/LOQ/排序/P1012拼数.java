package LOQ.排序;

import java.util.Scanner;

public class P1012拼数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //吃掉回车符
        sc.nextLine();
        boolean flag = true;
        String[] strs = sc.nextLine().split(" ");
        //控制比较的循环次数
            for(int i=0;flag;i++) {
                //每次循环比较的次数
            for(int j=0;j<n-1-i;j++) {
                flag = false;
                //获取到要比较的值
                String s1 = strs[j];
                String s2 = strs[j+1];
                //每次循环确定一个最大值
                if(Integer.parseInt(s1+s2)>Integer.parseInt(s2+s1)) {
                    String tp = strs[j+1];
                    strs[j+1] = strs[j];
                    strs[j] = tp;
                    flag=true;
                }
            }
        }
        for(int i=n-1;i>=0;i--) {
            System.out.print(strs[i]);
        }
    }
}
