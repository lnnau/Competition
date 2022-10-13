package LOQ.模拟与高精度;

import java.util.Scanner;

public class P1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt(), p2 = sc.nextInt(), p3 = sc.nextInt();
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {   //扫描字符串
            if (str.charAt(i) == '-') {    //扫描到需要填充字符串的位置
                char lch = str.charAt(i - 1);
                char rch = str.charAt(i + 1);
                if (lch < rch) {   //筛选出符合填充条件的位置
                    if (p1 == 1) {
                        for (int j = lch + 1; j < rch; j++) {//确定填充的字符
                            for (int m = 0; m < p2; m++) { //每个字符需要填充的长度
                                char ch = (char) j;
                                sb.append(ch);
                            }
                        }
                        sb.append("!"); //添加填充过程中的分隔符
                    } else if (p1 == 2) {
                        for (int j = lch + 1 - 32; j < rch - 32; j++) {//确定填充的字符
                            for (int m = 0; m < p2; m++) { //每个字符需要填充的长度
                                char ch = (char) j;
                                sb.append(ch);
                            }
                        }
                        sb.append("!"); //添加填充过程中的分隔符
                    } else {
                        for (int j = lch + 1; j < rch; j++) {//确定填充的字符
                            for (int m = 0; m < p2; m++) { //每个字符需要填充的长度
                                sb.append("*");
                            }
                        }
                        sb.append("!"); //添加填充过程中的分隔符
                    }
                }
            }
        }
        if (p3 == 2) {
            sb.reverse();   //反转
        }
        String res = sb.toString();
        for (int s = 0; s < str.length(); s++) {
            if (str.charAt(s) == '-') {
                char lch = str.charAt(s - 1);
                char rch = str.charAt(s + 1);
                if((lch<97 && rch>=97)||(lch>=97 && rch<97)) {//不符合的只用输出即可
                    System.out.print(str.charAt(s));
                }else if (lch >= rch) {
                    System.out.print(str.charAt(s));
                } else if (rch - 1 == lch) {
                } else {
                    for (int ss = 0; ss < res.length(); ss++) {
                        if (res.charAt(ss) != '!') {
                            System.out.print(res.charAt(ss));
                        } else {
                            res = res.substring(ss+1);  //舍弃已经输出过的
                            break;
                        }
                    }
                }
            } else {
                System.out.print(str.charAt(s));
            }
        }
    }
}
