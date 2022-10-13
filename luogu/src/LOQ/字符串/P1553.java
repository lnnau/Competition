package LOQ.字符串;
import java.util.Scanner;
/*
整数反转 升级版
 */
public class P1553 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int index=0;
        for(int i=0;i<s1.length();i++) {
            if(s1.charAt(i)=='.') {
                index=1;    //判断输入情况并记录
                break;
            } else if(s1.charAt(i)=='/') {
                index=2;
                break;
            } else if(s1.charAt(i)=='%') {
                index=3;
                break;
            }
        }
        String[] s2 = s1.split("[.|//|%]"); //获取到分隔后的一部分或两部分
        StringBuilder sb1 = new StringBuilder(s2[0]);
        StringBuilder sb2 = null;
        if(index==1 || index==2) {  //若可以分成两部分就分成两部分
            sb2 = new StringBuilder(s2[1]);
            sb2.reverse();
        }
        sb1.reverse();
        switch (index) {
            case 0:
                //转换成长整数输出
                System.out.println(Long.parseLong(String.valueOf(sb1)));
                break;
            case 1:
                sb2.reverse();  //消除分子部分后置零
                long l=Long.parseLong(String.valueOf(sb2));
                StringBuilder sb3 = new StringBuilder(String.valueOf(l));
                System.out.println(Long.parseLong(String.valueOf(sb1))+"."+sb3.reverse());
                break;
            case 2:
                System.out.println(Long.parseLong(String.valueOf(sb1))+"/"+Long.parseLong(String.valueOf(sb2)));
                break;
            case 3:
                System.out.println(Long.parseLong(String.valueOf(sb1))+"%");
                break;
        }
    }
}
