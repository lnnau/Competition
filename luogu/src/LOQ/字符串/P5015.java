package LOQ.字符串;

import java.util.Scanner;

/*
统计字符数
 */
public class P5015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[] s = sc.next().split("");
//        System.out.println(s.length);
        char[] chars = sc.nextLine().toCharArray();
        int count =0;
        for(int i=0;i< chars.length;i++) {
            if((chars[i]<='Z'&&chars[i]>='A')||(chars[i]<='z'&&chars[i]>='a')||(chars[i]<='9'&&chars[i]>='0')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
