package LOQ.字符串;

import java.util.Scanner;

public class P1598 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] index = new int[26];  //记录26个字母出现次数
        String str; //存储当前行字符串
        char ch;    //存储当前字符
        for(int i=0;i<4;i++) {  //共四行
            str=sc.nextLine();
            for(int j=0;j<str.length();j++) {
                ch=str.charAt(j);   //获取当前字符
                if(ch<='Z' && ch>='A') {
                    index[ch-'A']++;    //当前索引加一
                }
            }
        }
        //得到最高行
        int max=0;
        for(int m=0;m<26;m++) {
            if(max<index[m]) {
                max=index[m];
            }
        }
        //输出
        for(int i=max;i>=1;i--) {   //从最高行开始
            for(int j=0;j<26;j++) {//从第一个字母开始
                if(i==index[j]) {
                    index[j]--; //每输出一个就对应减一
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();   //完成一行后换行
        }
        for(int i=0;i<26;i++) {
            char c = (char) ('A'+i);
            System.out.print(c+" ");
        }
    }
}
