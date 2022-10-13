package LOQ.字符串;

import java.util.Scanner;
/*
字符串操作
 */
public class P5734 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); //起始输入字符串的长度，我感觉没什么用处
        String start = sc.next();   //起始字符串
        while(sc.hasNext()) {   //进行多次输入操作
            int num=sc.nextInt();   //执行操作的序号
            switch (num) {
                case 1:
                    start = start.concat(sc.next());
                    System.out.println(start);
                    break;
                case 2:
                    int a=sc.nextInt(),b=sc.nextInt();
                    start=start.substring(a,a+b);
                    System.out.println(start);
                    break;
                case 3:
                    int index=sc.nextInt(); //插入的起始位置
                    String sub=sc.next();   //子串
                    start=start.substring(0,index)+sub+start.substring(index);
                    System.out.println(start);
                    break;
                case 4:
                    System.out.println(start.indexOf(sc.next()));
                    break;
            }
        }
    }
}
