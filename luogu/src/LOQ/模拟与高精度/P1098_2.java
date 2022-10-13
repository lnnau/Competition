package LOQ.模拟与高精度;

import java.util.Scanner;

public class P1098_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt(), p2 = sc.nextInt(), p3 = sc.nextInt();
        String str = sc.next(), temStr;
        for (int i = 1; i < str.length()-1; i++) {   //扫描字符串
            char lch = str.charAt(i - 1);
            char rch = str.charAt(i + 1);
            if (str.charAt(i) == '-' && lch < rch && rch - lch < 26 && lch!='-' && rch!='-') {    //扫描到需要填充字符串的位置
                temStr = "";
                for (int j = lch + 1; j < rch; j++) {//确定填充的字符
                    int temp=p2;
                    if (p1 == 3) {
                        for (int m = 0; m < p2; m++) { //每个字符需要填充的长度
                            temStr +="*"; //填充星号不用考虑p3
                        }
                    } else if(p3==1) { //正序
                        for(;temp>0;temp--) //填充的次数
                        temStr+=(char)j;
                    } else if(p3==2) {//逆序
                        for(;temp>0;temp--)
                        temStr+=(char)(rch+lch-j);
                    }
                    if(p1==2) {
                        temStr=temStr.toUpperCase();    //转大写
                    }
                }
                str=str.substring(0,i)+temStr+str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}