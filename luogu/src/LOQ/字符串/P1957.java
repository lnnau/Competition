package LOQ.字符串;
import java.util.Scanner;
/*
四则运算排版
 */
public class P1957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = Integer.parseInt(sc.nextLine());
        String ch = "";    //暂存这一次的运算符
        for(int j=0;j<i;j++) {
            String ss = sc.nextLine(),result="";
            String[] s = ss.split("\\s+");  //去掉空格类字符
            int a,b;
            if(ss.startsWith("a")) {    //获取第一个字符，也就是运算符
                ch="a";
                a=Integer.parseInt(s[1]);
                b=Integer.parseInt(s[2]);
            } else if(ss.startsWith("b")) {
                ch="b";
                a=Integer.parseInt(s[1]);
                b=Integer.parseInt(s[2]);
            } else if(ss.startsWith("c")) {
                ch="c";
                a=Integer.parseInt(s[1]);
                b=Integer.parseInt(s[2]);
            } else {    //使用上一个运算的运算符
                a=Integer.parseInt(s[0]);
                b=Integer.parseInt(s[1]);
            }
            switch (ch) {   //拼接输出结果
                case "a":
                    result=a+"+"+b+"="+(a+b);
                    break;
                case "b":
                    result=a+"-"+b+"="+(a-b);
                    break;
                case "c":
                    result=a+"*"+b+"="+(a*b);
                    break;
            }
            System.out.print(result+"\n"+result.length());
        }
        sc.close();
    }
}
