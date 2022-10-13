package LOQ.排序;

import java.util.*;
public class P1068 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //分数线在集合中的位置
        int loc = (int)Math.floor(m*1.5);
        //分数线
        int line = 0;
        //集合
        Set<Volunteers> set = new TreeSet<Volunteers>(new Comparator<Volunteers>() {
            public int compare(Volunteers v1,Volunteers v2) {
                int num = v2.grade - v1.grade;
                int num1 = num==0 ?v1.id-v2.id : num;
                return num1;
            }
        }
        );
        //将数据添加到集合中
        for(int i=0;i<n;i++) {
            int id = sc.nextInt();
            int grade = sc.nextInt();
            //创建志愿者对象
            Volunteers volunteers = new Volunteers();
            volunteers.id = id;
            volunteers.grade = grade;
            set.add(volunteers);
        }
        //求分数线
        int count = 1;
        int peop = 0;
        for(Volunteers v:set) {
            if(line==v.grade) {
                peop++;
            }
            //得到分数线
            if(count==loc) {
                line = v.grade;
            }
            count++;
            //得到满足分数线的人数

        }
        //输出结果
        //将到线的人和线附近重复的人数加起来
        int res = loc+peop;
        System.out.println(line+" "+res);
        int flag = 0;
        for(Volunteers v:set) {
            flag++;
            if(flag<=res) {
                System.out.println(v.id+" "+v.grade);
            }
        }
    }
}
class Volunteers{
    int id;
    int grade;
}

