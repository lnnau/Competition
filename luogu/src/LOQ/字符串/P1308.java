package LOQ.字符串;

import java.util.Locale;
import java.util.Scanner;

/*
统计单词出现次数
 */
public class P1308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine().toLowerCase(Locale.ROOT);   //要查找的字符串
        String s = sc.nextLine().toLowerCase(Locale.ROOT);   //文章
        String[] s1 = s.split(" ");
        int count = 0;    //存储出现的次数
        int start = s.indexOf(sub); //记录第一次出现的位置
        for(int i=0;i<s1.length;i++) {
            if(s1[i].indexOf(sub)!=-1) {
                count++;
            }
        }
//        while (s.indexOf(sub) != -1) {
//             //说明子串在文章中找到了
//                int i = s.indexOf(sub);
//                count++;    //出现次数加一
//                s = s.substring(i + sub.length());  //删除出现字符及前面的字符
//        }
        if(count!=0)
        System.out.println(count+" "+start);
        else System.out.println("-1");
    }
}
