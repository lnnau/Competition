package LOQ.函数与结构体;

import java.util.*;

public class P5741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //吃掉回车
        sc.nextLine();
        List<String> list = new ArrayList<>();
        ArrayList<String> al = new ArrayList<>();
        //添加数据到集合
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            list.add(str);
        }
        for (int i = 0; i < n-1; i++) {
            String[] str1 = list.get(i).split(" ");
            int sum1 = Integer.parseInt(str1[1]) + Integer.parseInt(str1[2]) + Integer.parseInt(str1[3]);
            for(int j=i+1;j<n;j++) {
                String[] str2 = list.get(j).split(" ");
                int sum2 = Integer.parseInt(str2[1]) + Integer.parseInt(str2[2]) + Integer.parseInt(str2[3]);
                if(Math.abs(Integer.parseInt(str1[1]) - Integer.parseInt(str2[1])) <= 5 && Math.abs(Integer.parseInt(str1[2]) - Integer.parseInt(str2[2])) <= 5 && Math.abs(Integer.parseInt(str1[3]) - Integer.parseInt(str2[3])) <= 5 && Math.abs(sum1 - sum2) <= 10) {
                    al.add(str1[0]+" "+str2[0]);
                }
            }
        }
        list.clear();
        for(int i=0;i<al.size();i++) {
            String s = al.get(i);
            if(i!=al.size())
            System.out.println(s);
            else System.out.print(s);
        }
    }
}
